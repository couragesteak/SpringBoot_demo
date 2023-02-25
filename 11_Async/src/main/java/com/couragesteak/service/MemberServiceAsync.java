/*
 * @Author  : 有勇气的牛排（全网同名）
 * @FileName: Member.java
 * desc     :
 * */

package com.couragesteak.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MemberServiceAsync {
    @Async("taskExecutor")  // 指定线程池
    public String smsAsync() {
        log.info(">>> 2");

        try {
            log.info("正在发送中");
            Thread.sleep(3000);
        } catch (Exception e) {

        }

        return "恭喜注册成功";
    }
}
