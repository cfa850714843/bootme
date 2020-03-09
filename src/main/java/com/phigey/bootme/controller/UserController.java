package com.phigey.bootme.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author hanyu
 */

@RestController
@RequestMapping(path = "user")
public class UserController {
    @GetMapping
    public String users(){
        return "<h2>App is running...</h2>";
    }

    @PostMapping("login")
    public String login(){
        return "<h2>App is running...</h2>";
    }

    @PostMapping("register")
    public String register(){
        return "<h2>App is running...</h2>";
    }
}
