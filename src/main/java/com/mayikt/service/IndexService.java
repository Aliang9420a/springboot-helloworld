package com.mayikt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexService {

    @RequestMapping("/index")
    public String index(){
        return "云南白药";
    }

    @Value("${mayikt.name}")
    private String name;

    @Value("${mayikt.age}")
    private String age;

    @Value("${mayikt.age2}")
    private String age2;

    @RequestMapping("/name")
    public String getNameage(){
       // int i=1/0; 测试报错有无打印日志
        return name+age;
    }

    /**
     * 演示打印日志
     * @return
     */
    @RequestMapping("/getName")
    public String getName(){
        log.info("name:{},age:{}",name,age2);
        return name+"  "+age2;
    }
}
