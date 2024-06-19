package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Title: Brand
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 5:01
 * @description: 品牌
 */
@Data
public class Brand implements Serializable {
    @TableId
    private Long id; // 品牌 id
    private String name; // 品牌名称
}
