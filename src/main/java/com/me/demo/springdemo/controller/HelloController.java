package com.me.demo.springdemo.controller;

import com.me.demo.springdemo.dto.HelloDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public HelloDto hello(){
        log.info("HelloController get /hello");
        HelloDto helloDto = new HelloDto();
        helloDto.setMessage("Hello !!");
        return helloDto;
    }
}
