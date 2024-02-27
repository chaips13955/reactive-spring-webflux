package com.reactivespring.webflux.study.demo.controller;


import com.reactivespring.webflux.study.demo.interfaces.ITestController;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")

public class TestController implements ITestController {


    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld(){

        return "Hello Oswa Cachondo";
    }
}
