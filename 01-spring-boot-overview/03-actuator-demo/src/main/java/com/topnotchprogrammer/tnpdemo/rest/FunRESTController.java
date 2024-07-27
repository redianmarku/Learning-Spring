package com.topnotchprogrammer.tnpdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRESTController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @Value("${tnp.owner}")
    private String owner;

    @GetMapping("/owner")
    public String showOwner(){
        return owner;
    }

}
