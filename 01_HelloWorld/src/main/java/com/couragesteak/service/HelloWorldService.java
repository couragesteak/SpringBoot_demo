package com.couragesteak.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldService {

    /*
     * @RestController 与 Controller 之间区别
     * 如果在类上加@RestController，该类中所有SpringMVCUrl接口映射都是返回json格式
     * @RestController：由SpringMVC提供,相当于在每个方法添加ResponseBody注解
     * Rest 微服务接口开发中，数据传输格式为json格式，协议为http协议
     *
     * Controller控制层注解，默认返回页面跳转，如果返回json须添加ResponseBody注解
     *
     * */

    // http://127.0.0.1:8080/hello
    @RequestMapping("/hello")
    public String index() {
        return "你好，有勇气的牛排";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldService.class, args);
    }
}
