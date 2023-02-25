/*
 * @Author  : 有勇气的牛排（全网同名）
 * @FileName: ScheduledTasks.java
 * desc     : 注解 定时任务
 * */

package com.couragesteak.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduledTasks {

    // @Scheduled(fixedRate = 3000)     // 每3s执行一次
    @Scheduled(cron = "1/2 * * * 8 ?")  // cron表达式
    public void taskService() {
        log.info("定时任务被执行: " + System.currentTimeMillis());
    }

}