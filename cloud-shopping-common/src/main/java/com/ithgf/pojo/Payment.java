package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Title: Payment
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 5:14
 * @description: 支付记录
 */
@Data
public class Payment implements Serializable {
    // 支付记录id
    @TableId
    private Long id;
    private String orderId; // 订单Id
    private String transactionId; // 支付系统交易编号
    private String tradeType; // 交易类型
    private String tradeState; // 交易状态
    private BigDecimal payerTotal;// 支付金额（元）
    private String content;// 通知参数
    private Date createTime;// 创建时间
}
