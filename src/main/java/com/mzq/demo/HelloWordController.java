package com.mzq.demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/*
* test Api
*
* */
@RestController

class HelloWordController {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;


    @RequestMapping("/hello")
    public  String hello(){

        return "Hello Spring boot";
    }
//    @Slf4j

    @RequestMapping(value = "/UserInfo")
    public  String UserInfo(){

        return "Name: "+ name + " age: " + age;
    }

}
