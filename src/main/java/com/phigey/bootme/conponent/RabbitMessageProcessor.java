package com.phigey.bootme.conponent;

import com.phigey.bootme.configuration.SystemConfig;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lizf
 */

@Component
public class RabbitMessageProcessor {

    private Logger logger = LoggerFactory.getLogger(RabbitMessageProcessor.class);

    @Value("${global.queue.result}")
    String resultQueue;

    @Autowired
    private CommandExecutor commandExecutor;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "${global.queue.cmd}")
    public void receivedCmdMessage(byte[] msgBytes) {
        try {
            String cmd = new String(msgBytes, SystemConfig.ENCODING);
            commandExecutor.execute(cmd, msg -> {
                if (StringUtils.isNotBlank(msg)) {
                    rabbitTemplate.convertAndSend(resultQueue, msg.getBytes());
                } else {
                    rabbitTemplate.convertAndSend(resultQueue, SystemConfig.LINE_SEPARATOR.getBytes());
                }
            });
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RabbitListener(queues = "${global.queue.result}")
    public void receivedResultMessage(byte[] msgBytes) {
        try {
            String msg = new String(msgBytes,  SystemConfig.ENCODING);
            logger.info("Received message : [ {} ]", msg);
        }catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

}
