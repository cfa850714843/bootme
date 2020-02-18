package com.phigey.bootme;

import com.phigey.bootme.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lizf
 */

@SpringBootApplication
public class BootMeApplication implements ApplicationRunner {

    @Autowired
    private TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(BootMeApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        testService.test();
    }
}
