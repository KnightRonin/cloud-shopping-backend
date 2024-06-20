package com.ithgf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ithgf.pojo.Role;
import org.apache.ibatis.annotations.Param;

/**
 * @Title: RoleMapper
 * @Author ithgf
 * @Package com.ithgf.mapper
 * @Date 2024/6/20 21:32
 * @description: 角色接口
 */
public interface RoleMapper extends BaseMapper<Role> {
    // 根据id查询角色，包括权限
    Role findById(Long rid);
    // 删除角色的所有权限
    void deleteRoleAllPermission(Long rid);
    // 删除用户_角色表的相关数据
    void deleteRoleAllAdmin(Long rid);
    // 给角色添加权限
    void addPermissionToRole(@Param("rid") Long rid, @Param("pid") Long pid);
}
