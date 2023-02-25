/*
 * @Author  : 有勇气的牛排
 * @FileName: ReadProperties_ConfigurationProperties.java
 * desc     : ConfigurationProperties 配置文件读取
 * */

package com.couragesteak.service;

import com.couragesteak.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadProperties_ConfigurationProperties {

    @Autowired
    private UserEntity userEntity;

    //
    @RequestMapping("/getInfo")
    public String getInfo(String userName, Integer age){
        System.out.println("666");
        return userEntity.toString();
    }

}
