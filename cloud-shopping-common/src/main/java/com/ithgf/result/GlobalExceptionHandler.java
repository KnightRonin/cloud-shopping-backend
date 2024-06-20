package com.ithgf.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Title: GlobalExceptionHandler
 * @Author ithgf
 * @Package com.ithgf.result
 * @Date 2024/6/20 15:47
 * @description: 统一异常处理控制器
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    // 业务异常
    @ExceptionHandler(BusException.class)
    public BaseResult defaultExceptionHandler(BusException e){
        return new BaseResult(e.getCode(),e.getMessage(),null);
    }
    // 系统异常
    @ExceptionHandler(Exception.class)
    public BaseResult defaultExceptionHandler(Exception e){
        e.printStackTrace();
        return new BaseResult(CodeEnum.SYSTEM_ERROR.getCode(), CodeEnum.SYSTEM_ERROR.getMessage(), null);
    }
}
