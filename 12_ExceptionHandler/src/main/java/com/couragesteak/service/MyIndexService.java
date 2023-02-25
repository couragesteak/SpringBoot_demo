/*
 * @Author  : 有勇气的牛排（全网同名）
 * @FileName: MyIndex.java
 * desc     :
 * */

package com.couragesteak.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyIndexService {

    // http://127.0.0.1:8080/index?num=2
    @RequestMapping("/index")
    public int MyIndexPage(int num) {

        int j = 1 / num;
        return j;
    }

}
