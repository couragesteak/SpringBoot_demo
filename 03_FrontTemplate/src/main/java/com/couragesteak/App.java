package com.couragesteak;
/*
 * @Author  : 有勇气的牛排
 * @FileName: APP.java
 * desc     : 启动
 * */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /*
     * @ComponentScan 扫包范围：
     *   当前启动类同级包，或者子包
     * */

}
