package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @Title: Admin
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 4:57
 * @description: 后台管理员用户
 */
@Data
public class Admin {
    @TableId
    private Long aid; // 用户id
    private String username; // 用户名
    private String password; // 密码
    @TableField(exist = false) // 数据库不存在该字段
    private List<Role> roles; // 用户拥有的角色集合
}
