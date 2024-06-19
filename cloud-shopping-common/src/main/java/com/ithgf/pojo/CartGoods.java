package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Title: CartGoods
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 5:02
 * @description: 购物车商品/订单商品
 */
@Data
public class CartGoods implements Serializable {
    @TableId
    private Long id;
    private Long goodId; // 商品id
    private String goodsName; // 商品名称
    private BigDecimal price; // 单价
    private String headerPic; // 头图
    private Integer num; // 购买数量
    private String orderId; // 属于的订单id
}
