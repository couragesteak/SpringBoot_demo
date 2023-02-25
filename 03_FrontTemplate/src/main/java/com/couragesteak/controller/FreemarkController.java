/*
 * @Author  : 有勇气的牛排
 * @FileName: FreemarkController.java
 * desc     : Freemark模板引擎
 * */

package com.couragesteak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class FreemarkController {

    // import java.util.Map;
    // http://127.0.0.1:8080/freemarkIndex
    @RequestMapping("/freemarkIndex")
    public String freemarkIndex(Map<String, Object> result, HttpServletRequest request) {
        System.out.println(666);

        // 传数据到页面
        result.put("name", "有勇气的牛排");
        result.put("sex", "0");
        result.put("age", 20);

        ArrayList<Object> tagList = new ArrayList<>();
        tagList.add("全程");
        tagList.add("解决方案");

        result.put("tagList", tagList);

        return "freemarkIndex";

    }
}
