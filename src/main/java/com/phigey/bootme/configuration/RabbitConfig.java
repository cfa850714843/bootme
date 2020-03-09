package com.phigey.bootme.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class RabbitConfig {

    private Logger logger = LoggerFactory.getLogger(RabbitConfig.class);

    @Value("${global.queue.cmd}")
    String cmdQueue;

    @Value("${global.queue.result}")
    String resultQueue;

    @Bean
    public Queue cmdQueue(){
        logger.info("create cmd queue!");
        return new Queue(cmdQueue, true, true, false);
    }

    @Bean
    public Queue resultQueue(){
        logger.info("create result queue!");
        return new Queue(resultQueue,true, true, false);
    }

}
