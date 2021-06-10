package com.mayikt.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("com.mayikt.service")
public class HelloService {

//    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
    System.out.println("断点+shift+鼠标左键") ;
        return "cg";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(HelloService.class,args);
//    }
}
