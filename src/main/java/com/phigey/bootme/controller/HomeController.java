package com.phigey.bootme.controller;

import com.phigey.bootme.service.LocalCmdExecuteService;
import com.phigey.bootme.worker.IWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lizf
 */

@RestController
@RequestMapping(path = {"/", "/home"})
public class HomeController {

    @Autowired
    private LocalCmdExecuteService localCommandExecuteService;

    @Autowired
    private IWorker iWorker;

    @GetMapping
    public String home(){
        return "<h2>App is running...</h2>";
    }

    @GetMapping(path = "test")
    public String test() {
        iWorker.doSomething();
        localCommandExecuteService.executeCmd();
        return "<h2>test service!</h2>";
    }
}
