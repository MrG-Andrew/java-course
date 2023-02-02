package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String getTimeNow(){
        return "hello bitch time now is: " + LocalDateTime.now();
    }

    @GetMapping("/rocky")
    public String theRock(){
        return "if you smell what the rock is cooking";
    }

    @GetMapping("/bitch")
    public String autoRe(){
        return "the greatest of all time";
    }
}
