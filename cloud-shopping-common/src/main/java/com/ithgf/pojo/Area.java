package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Title: Area
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 5:00
 * @description: 县/区
 */

@Data
public class Area implements Serializable {
    @TableId
    private String id; // 区/县Id
    private String area; // 区/县名
    private String cityId; // 城市Id
}
