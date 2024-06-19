package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Title: Specification
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 5:06
 * @description: 规格
 */

@Data
public class Specification implements Serializable {
    @TableId
    private Long id; // 规格id
    private String specName; // 规格名
    private Long productTypeId; //商品类型id
    @TableField(exist = false)
    private List<SpecificationOption> specificationOptions; // 规格项
}
