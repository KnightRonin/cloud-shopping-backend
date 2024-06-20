package com.ithgf.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ithgf.mapper.RoleMapper;
import com.ithgf.pojo.Role;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Title: RoleServiceImpl
 * @Author ithgf
 * @Package com.ithgf.service
 * @Date 2024/6/20 21:39
 * @description: 角色管理
 */

@Transactional
@DubboService
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;
    /**
     * 新增角色
     * @param role 角色对象
     */
    @Override
    public void add(Role role) {
        roleMapper.insert(role);
    }

    /**
     * 修改角色
     * @param role 角色对象
     */
    @Override
    public void update(Role role) {
        roleMapper.updateById(role);

    }

    /**
     * 根据id删除角色
     * @param rid 角色id
     */
    @Override
    public void delete(Long rid) {
        // 删除角色
        roleMapper.deleteById(rid);
        // 删除角色的所有权限
        roleMapper.deleteRoleAllPermission(rid);
        // 删除角色的相关表数据
        roleMapper.deleteRoleAllAdmin(rid);

    }

    /**
     * 根据id查询角色，包括权限
     * @param rid 角色id
     * @return 执行结果
     */
    @Override
    public Role findById(Long rid) {
        return roleMapper.findById(rid);

    }

    /**
     * 查询所有角色
     * @return 执行结果
     */
    @Override
    public List<Role> findAll() {
        return roleMapper.selectList(null);
    }

    /**
     * 角色分页查询
     * @param page 页码
     * @param size 码数
     * @return
     */
    @Override
    public Page<Role> search(int page, int size) {
        return roleMapper.selectPage(new Page(page,size),null);
    }

    @Override
    public void updatePermissionToRole(Long rid, Long[] pids) {
        // 删除用户的所有权限
        roleMapper.deleteRoleAllPermission(rid);
        for (Long pid : pids) {
            // 添加用户权限
            roleMapper.addPermissionToRole(rid,pid);
        }
    }
}
