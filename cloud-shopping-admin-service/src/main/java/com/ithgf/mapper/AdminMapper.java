package com.ithgf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ithgf.pojo.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * @Title: AdminMapper
 * @Author ithgf
 * @Package com.ithgf.mapper
 * @Date 2024/6/20 16:58
 * @description: 管理员接口
 */
public interface AdminMapper extends BaseMapper<Admin> {
    // 删除管理员的所有角色
    void deleteAdminAllRole(Long aid);
    // 根据id查询管理员，包括权限和角色
    Admin findById(Long aid);

    // 添加角色
    void addRoleToAdmin(@Param("aid") Long aid,@Param("rid") Long rid);
}
