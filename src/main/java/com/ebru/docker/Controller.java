package com.ebru.docker;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin
@RestController
public class Controller {

    @GetMapping("/")
    public String getMethodName() {
        return "hello world";
    }
    
}
