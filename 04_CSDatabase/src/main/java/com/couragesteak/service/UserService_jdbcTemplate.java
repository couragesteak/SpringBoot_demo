/*
 * @Author  : 有勇气的牛排
 * @FileName: UserService_jdbcTemplate.java
 * desc     :
 * */

package com.couragesteak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService_jdbcTemplate {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*
     * 插入数据到user表
     * */
    // http://127.0.0.1:8080/insertUser?userName=cs666&age=21
    @RequestMapping("/insertUser")
    public String insertUser(String userName, Integer age) {
        int update = jdbcTemplate.update("insert into users values (null, ?, ?)", userName, age);
        return update > 0 ? "success" : "fail";
    }
}
