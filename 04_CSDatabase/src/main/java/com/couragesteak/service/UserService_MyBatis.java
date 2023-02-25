/*
 * @Author  : 有勇气的牛排
 * @FileName: UserService_MyBatis.java
 * desc     :
 * */

package com.couragesteak.service;

import com.couragesteak.entity.UserEntity;
import com.couragesteak.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService_MyBatis {

    @Autowired
    private UserMapper userMapper;

    /**
     * MyBatis 查询数据
     */
    // http://127.0.0.1:8080/mybatis_findUser?id=3
    @RequestMapping("/mybatis_findUser")
    public UserEntity mybatis_FindUserById(Integer id) {
        System.out.println("======mybatis_FindUserById=======");
        System.out.println(id);
        return userMapper.selectByUserId(id);
    }

    /**
     * MyBatis 插入数据
     */
   // http://127.0.0.1:8080/mybatis_insertUser?userName=cs7&age=22
    @RequestMapping("/mybatis_insertUser")
    public String mybatis_insertUser(String userName, Integer age) {
        int insert = userMapper.insertUser(userName, age);
        return insert > 0 ? "success" : "fail";
    }

}
