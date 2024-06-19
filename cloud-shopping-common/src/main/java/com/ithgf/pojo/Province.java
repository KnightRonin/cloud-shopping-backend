package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Title: Province
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 5:16
 * @description: 省份
 */
@Data
public class Province implements Serializable {
    @TableId
    private String id; // 省份id
    private String provinceName; // 省份名
}
