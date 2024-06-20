package com.ithgf.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Title: BusException
 * @Author ithgf
 * @Package com.ithgf.result
 * @Date 2024/6/20 15:38
 * @description: 统一异常处理
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusException extends RuntimeException{
    private Integer code; //状态码
    private String message; //错误消息

    public BusException(CodeEnum codeEnum){
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }
}
