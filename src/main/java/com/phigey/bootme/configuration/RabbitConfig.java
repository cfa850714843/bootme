package com.phigey.bootme.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author lizf
 */
@Lazy
@Configuration
@Slf4j
public class RabbitConfig {

    @Value("${global.queue.cmd}")
    String cmdQueue;

    @Value("${global.queue.result}")
    String resultQueue;

    @Bean
    public Queue cmdQueue(){
        log.info("create cmd queue!");
        return new Queue(cmdQueue, true, true, false);
    }

    @Bean
    public Queue resultQueue(){
        log.info("create result queue!");
        return new Queue(resultQueue,true, true, false);
    }

}
