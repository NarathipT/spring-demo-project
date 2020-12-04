package com.me.demo.springdemo.controller;

import com.me.demo.springdemo.dto.PersonDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class PersonController {
    private static Logger logger = LoggerFactory.getLogger(PersonController.class);

    @GetMapping("/person")
    public PersonDto person(){
        log.info("PersonController get /person");
        PersonDto personDto = new PersonDto();
        personDto.setFirstName("TestName");
        personDto.setLastName("TestLast");
        personDto.setAge("25");
        return personDto;
    }
}
