/*
 * @Author  : 有勇气的牛排
 * @FileName: ReadProperties.java
 * desc     : Value 配置文件读取
 * */

package com.couragesteak.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadProperties_Value {

    @Value("${cs.name}")
    private String name;
    @Value("${cs.star}")
    private String star;

    // http://127.0.0.1:8080/getProperties
    @RequestMapping("/getProperties")
    public String getProperties() {
        return name + ":" + star;
    }
}
