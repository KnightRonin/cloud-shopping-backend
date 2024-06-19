package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Title: Address
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 4:38
 * @description: 收货地址
 */
@Data
@TableName("shop_address")
public class Address implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id; //地址id
    private Long userId; // 用户id
    private String provinceName; // 省份名
    private String cityName; // 市名
    private String areaName; // 县/区
    private String address; // 详细地址
    private String mobile; // 手机
    private String contact; // 联系人姓名
    private String zipCode; // 邮编

}
