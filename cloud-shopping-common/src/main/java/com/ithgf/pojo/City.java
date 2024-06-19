package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Title: City
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 5:04
 * @description: 城市
 */
@Data
public class City implements Serializable {
    @TableId
    private String id; // 城市id
    private String city; // 城市名
    private String provinceId; // 省份id
}
