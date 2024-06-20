package com.ithgf.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Title: Role
 * @Author ithgf
 * @Package com.ithgf.pojo
 * @Date 2024/6/20 4:58
 * @description: 后台管理员角色
 */
@Data
public class Role implements Serializable {
    @TableId
    private Long rid; // 角色id
    private String roleName; // 角色名
    private String roleDesc; // 角色介绍
    @TableField(exist = false) // 数据库不存在该字段
    private List<Permission> permissions; // 角色拥有的权限集合
}
