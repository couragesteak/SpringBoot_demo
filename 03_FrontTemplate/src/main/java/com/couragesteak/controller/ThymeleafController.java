/*
 * @Author  : 有勇气的牛排
 * @FileName: ThymeleafController.java
 * desc     :
 * */

package com.couragesteak.controller;

import com.couragesteak.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class ThymeleafController {

    // http://127.0.0.1:8080/myThymeleaf
    @RequestMapping("/myThymeleaf")
    public String myThymeleafController(HttpServletRequest request, Map<String, Object> result) {
//        request.setAttribute("ruser", new UserEntity("cs", 20));

        result.put("user", new UserEntity("cs", 17));

        ArrayList<Object> userEntitys = new ArrayList<>();
        userEntitys.add(new UserEntity("CS1", 16));
        userEntitys.add(new UserEntity("CS2", 20));
        result.put("userList", userEntitys);

        return "myThymeleaf";
    }
}
