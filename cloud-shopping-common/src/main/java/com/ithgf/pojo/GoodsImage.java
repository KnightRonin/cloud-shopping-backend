package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Title: GoodsImage
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 5:10
 * @description: 商品图片
 */
@Data
public class GoodsImage implements Serializable {
    @TableId
    private Long id; // 图片id
    private String imageTitle; // 图片标题
    private String imageUrl; // 图片路径
    private Long goodsId; // 商品id
}
