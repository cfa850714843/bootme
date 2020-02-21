package com.phigey.bootme.service.impl;

import com.phigey.bootme.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * @author lizf
 */

@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Value("${global.queue.cmd}")
    String cmdQueue;

    @Override
    public void test() {
        rabbitTemplate.convertAndSend(cmdQueue, "help".getBytes());
    }
}
