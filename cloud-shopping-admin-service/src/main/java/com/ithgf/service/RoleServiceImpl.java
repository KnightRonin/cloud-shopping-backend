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

    }

    @Override
    public void update(Role role) {

    }

    @Override
    public void delete(Long rid) {

    }

    @Override
    public Role findById(Long rid) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public Page<Role> search(int page, int size) {
        return null;
    }

    @Override
    public void updatePermissionToRole(Long rid, Long[] pids) {

    }
}
