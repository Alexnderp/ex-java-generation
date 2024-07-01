package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String hello(){
        LocalDateTime now = LocalDateTime.now();
        String moment;

        if(now.getHour() > 0 && now.getHour() < 12){
            moment = "Good Morning World!!";
        } else if (now.getHour() >= 12 && now.getHour() < 18) {
            moment = "Good Afternoon World!!";
        } else {
            moment = "Good Night World!!";
        }
        return moment;
    }
}
