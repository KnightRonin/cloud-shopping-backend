package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Title: SpecificationOptions
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 4:45
 * @description: 商品规格项集合，用于新增规格项
 */
@Data
public class SpecificationOptions implements Serializable {
    private Long specId; // 规格id
    private String[] optionName; // 规格项名数组
}
