/*
 * @Author  : 有勇气的牛排
 * @FileName: MyIndex.java
 * desc     :
 * */

package com.couragesteak.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MyIndex {

    private static final Logger log = Logger.getLogger(String.valueOf(MyIndex.class));

    // http://127.0.0.1:8083/getInfo?name=cs&age=22
    @RequestMapping("/getInfo")
    public String getInfo(String name, int age) {
//        log.info("===============");
//        log.info("name: " + name + ", age: " + age);
        return name;
    }

}
