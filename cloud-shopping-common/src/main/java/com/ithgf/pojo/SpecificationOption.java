package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Title: SpecificationOption
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 4:50
 * @description: 规格项
 */

@Data
public class SpecificationOption implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id; // 规格项id
    private String optionName; // 规格项名
    private Long specId; // 对应的规格id
}
