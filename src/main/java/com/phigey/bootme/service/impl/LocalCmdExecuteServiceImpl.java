package com.phigey.bootme.service.impl;

import com.phigey.bootme.service.LocalCmdExecuteService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * @author lizf
 */

@Service
public class LocalCmdExecuteServiceImpl implements LocalCmdExecuteService {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Value("${global.queue.cmd}")
    String cmdQueue;

    @Override
    public void executeCmd() {
        rabbitTemplate.convertAndSend(cmdQueue, "help".getBytes());
    }
}
