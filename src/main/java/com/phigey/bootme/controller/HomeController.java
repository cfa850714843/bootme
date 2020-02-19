package com.phigey.bootme.controller;

import com.phigey.bootme.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizf
 */

@RestController
@RequestMapping(path = {"/", "/home"})
public class HomeController {

    @Autowired
    private TestService testService;

    @GetMapping
    public String home(){
        return "<h2>App is running...</h2>";
    }

    @GetMapping(path = "test")
    public String test() {
        testService.test();
        return "<h2>test service!</h2>";
    }
}
