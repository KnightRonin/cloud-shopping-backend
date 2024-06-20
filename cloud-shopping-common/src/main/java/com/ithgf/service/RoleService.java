package com.ithgf.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ithgf.pojo.Role;

import java.util.List;

/**
 * @Title: RoleService
 * @Author ithgf
 * @Package com.ithgf.service
 * @Date 2024/6/20 21:22
 * @description: 角色服务接口
 */

public  interface RoleService {
    // 新增角色
    void add(Role role);
    // 修改角色
    void update(Role role);
    // 删除角色
    void delete(Long rid);
    // 根据id查询角色
    Role findById(Long rid);
    // 查询所有角色
    List<Role> findAll();
    // 分页查询角色
    Page<Role> search(int page, int size);
    // 修改角色的权限
    void updatePermissionToRole(Long rid, Long[] pids);


}
