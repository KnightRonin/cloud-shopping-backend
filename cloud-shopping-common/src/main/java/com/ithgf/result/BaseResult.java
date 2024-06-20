package com.ithgf.result;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.naming.directory.SearchResult;
import java.io.Serializable;

/**
 * @Title: BaseResult
 * @Author ithgf
 * @Package com.ithgf.result
 * @Date 2024/6/20 15:18
 * @description: API统一结果返回值
 */

@Data
@AllArgsConstructor
public class BaseResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    // 构建成功结果
    public static <T> BaseResult<T> success(){
        return new BaseResult<T>(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(),null);
    }
    // 构建带有数据的成功结果
    public static <T> BaseResult<T> success(T data){
        return new BaseResult<T>(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(),data);
    }


}
