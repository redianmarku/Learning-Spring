package com.topnotchprogrammer.tnpdemo.rest;

import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRESTController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

}
