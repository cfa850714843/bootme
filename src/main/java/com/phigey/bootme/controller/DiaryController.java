package com.phigey.bootme.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author hanyu
 */

@RestController
@RequestMapping(path = "diary")
public class DiaryController {
    @GetMapping("{id}")
    public String users(){
        return "<h2>App is running...</h2>";
    }

    @PostMapping("{id}")
    public String create(){
        return "<h2>App is running...</h2>";
    }

    @PutMapping("{id}")
    public String edit(){
        return "<h2>App is running...</h2>";
    }
}
