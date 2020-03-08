package com.phigey.bootme.conponent;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lizf
 */

@Component
public class MessageEventHandler {

    private Logger logger = LoggerFactory.getLogger(MessageEventHandler.class);

    @Autowired
    private SocketIOServer socketIoServer;

    @Autowired
    private CommandExecutor commandExecutor;

    public static ConcurrentHashMap<String, SocketIOClient> socketIOClientMap = new ConcurrentHashMap<>();

    /**
     * 客户端连接的时候触发
     *
     * @param client
     */
    @OnConnect
    public void onConnect(SocketIOClient client) {
        String mac = client.getHandshakeData().getSingleUrlParam("mac");
        socketIOClientMap.put(mac, client);
        client.sendEvent("message", "onConnect back");
        logger.info("client= {}, mac= {}", client.getSessionId(), mac);
    }

    /**
     * 客户端关闭连接时触发
     *
     * @param client
     */
    @OnDisconnect
    public void onDisconnect(SocketIOClient client) {
        logger.info("client: {} disconnect", client.getSessionId());
    }

    /**
     * 客户端事件
     *
     * @param client  　客户端信息
     * @param request 请求信息
     * @param data    　客户端发送数据
     */
    @OnEvent(value = "tell1")
    public void onEvent(SocketIOClient client, AckRequest request, Message data) {
        logger.info("received: {}", data);
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
