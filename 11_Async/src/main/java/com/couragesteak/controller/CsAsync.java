/*
 * @Author  : 有勇气的牛排（全网同名）
 * @FileName: CsAsync.java
 * desc     :
 * */

package com.couragesteak.controller;

import com.couragesteak.service.MemberServiceAsync;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CsAsync {

    @Autowired
    private MemberServiceAsync memberServiceAsync;

    // http://127.0.0.1:8080/a_register
    @RequestMapping("/a_register")
    public String A_Register() {

        log.info(">>> 01");

        memberServiceAsync.smsAsync();

        log.info(">>> 03");
        return "注册成功";
    }
}
