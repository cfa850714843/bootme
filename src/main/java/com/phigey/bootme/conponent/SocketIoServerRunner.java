package com.phigey.bootme.conponent;

import com.corundumstudio.socketio.SocketIOServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author lizf
 */
@Component
public class SocketIoServerRunner implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(SocketIoServerRunner.class);

    @Autowired
    private SocketIOServer socketIOServer;

    @Override
    public void run(String... strings) {
        socketIOServer.start();
        logger.info("socket.io is running！");
    }
}
