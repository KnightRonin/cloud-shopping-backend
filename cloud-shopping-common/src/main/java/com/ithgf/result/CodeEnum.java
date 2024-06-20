package com.ithgf.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Title: CodeEnum
 * @Author ithgf
 * @Package com.ithgf.result
 * @Date 2024/6/20 15:21
 * @description: 返回状态码枚举类
 */

@Getter
@AllArgsConstructor
public enum CodeEnum {
    SUCCESS(200,"OK"),
    SYSTEM_ERROR(500,"系统异常"),
    PARAMETER_ERROR(601,"参数异常");
    private final Integer code;
    private final String message;

}
