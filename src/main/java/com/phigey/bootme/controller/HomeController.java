package com.phigey.bootme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizf
 */

@RestController
@RequestMapping(path = {"/", "/home"})
public class HomeController {

    @GetMapping
    public String home(){
        return "<h2>App is running...</h2>";
    }
}
