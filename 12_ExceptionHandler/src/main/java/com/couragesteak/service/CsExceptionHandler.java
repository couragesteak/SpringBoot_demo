/*
 * @Author  : 有勇气的牛排（全网同名）
 * @FileName: CsExceptionHandler.java
 * desc     : 全局异常处理
 * */

package com.couragesteak.service;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CsExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody   // 响应json, 如果响应页面可以注释掉这个
    public Map<Object, Object> exceptionHandler() {
        HashMap<Object, Object> result = new HashMap<>();
        result.put("code", 500);
        result.put("msg", "系统错误");
        return result;
    }
}
