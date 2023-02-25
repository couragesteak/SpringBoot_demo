/*
 * @Author  : 有勇气的牛排（全网同名）
 * @FileName: CsThread.java
 * desc     : 多线程案例（用户注册）、不推荐
 * */

package com.couragesteak.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CsThread {

    // http://127.0.0.1:8080/t_register
    @RequestMapping("/t_register")
    public String T_Register(){
        log.info(">>> 01");

        // 开启多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                sms();
            }
        }).start();

        log.info(">>> 03");
        return "注册成功";
    }

    public String sms(){
        log.info(">>> 02");
        return "恭喜注册";
    }

}
