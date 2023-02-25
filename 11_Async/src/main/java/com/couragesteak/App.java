package com.couragesteak;
/*
 * @Author  : 有勇气的牛排
 * @FileName: APP.java
 * desc     : 启动
 * */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync        // 开启异步注解
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
