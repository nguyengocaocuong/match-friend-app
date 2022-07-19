package com.matching.friend.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ErrorController {
    @GetMapping()
    public String hello(){
        return "Hello";
    }
}
