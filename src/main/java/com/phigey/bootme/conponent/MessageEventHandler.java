package com.phigey.bootme.conponent;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lizf
 */

@Component
@Slf4j
public class MessageEventHandler {
    @Autowired
    private SocketIOServer socketIoServer;

    @Autowired
    private CommandExecutor commandExecutor;

    public static ConcurrentMap<String, SocketIOClient> socketIOClientMap = new ConcurrentHashMap<>();

    /**
     * 客户端连接的时候触发
     *
     * @param client
     */
    @OnConnect
    public void onConnect(SocketIOClient client) {
        String mac = client.getHandshakeData().getSingleUrlParam("mac");
        //存储SocketIOClient，用于发送消息
        socketIOClientMap.put(mac, client);
        //回发消息
        client.sendEvent("message", "onConnect back");
        log.info("client= {}, mac= {}", client.getSessionId(), mac);
    }

    /**
     * 客户端关闭连接时触发
     *
     * @param client
     */
    @OnDisconnect
    public void onDisconnect(SocketIOClient client) {
        log.info("client: {} disconnect", client.getSessionId());
    }

    /**
     * 客户端事件
     *
     * @param client  　客户端信息
     * @param request 请求信息
     * @param data    　客户端发送数据
     */
    @OnEvent(value = "messageevent")
    public void onEvent(SocketIOClient client, AckRequest request, Message data) {
        log.info("received: {}", data);
        //广播消息
        String cmd = data.getMsg();
        commandExecutor.execute(cmd, msg -> sendBroadcast(msg));

    }

    /**
     * 广播消息
     */
    public void sendBroadcast(String msg) {
        for (SocketIOClient client : socketIOClientMap.values()) {
            if (client.isChannelOpen()) {
                client.sendEvent(msg);
            }
        }
    }
}
