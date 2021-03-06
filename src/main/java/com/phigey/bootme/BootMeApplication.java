package com.phigey.bootme;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author lizf
 */

@SpringBootApplication
@EnableAsync
public class BootMeApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(BootMeApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
