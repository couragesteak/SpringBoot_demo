/*
 * @Author  : 有勇气的牛排
 * @FileName: MyIndex.java
 * desc     :
 * */

package com.couragesteak.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@Slf4j
public class MyIndex {

//    private static Logger log = Logger.getLogger(MyIndex.class);

    // http://127.0.0.1:8080/getInfo?name=cs&age=22
    @RequestMapping("/getInfo")
    public String getInfo(String name, int age) {
        log.info("===============");
        log.info("name: {}, age: {}", name, age);
        return name;
    }

}
