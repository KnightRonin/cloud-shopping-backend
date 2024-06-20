package com.ithgf.controller;

import com.ithgf.pojo.Role;
import com.ithgf.result.BaseResult;
import com.ithgf.service.RoleService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: 角色管理
 * @Author ithgf
 * @Package com.ithgf.controller
 * @Date 2024/6/20 21:38
 * @description: 角色管理
 */

@RestController
@RequestMapping
public class RoleController {

    @DubboReference
    private RoleService roleService;

    /**
     * 新增角色
     * @param role 角色对象
     */
    public void addRole(Role role){
        roleService.add(role);
        BaseResult.success("添加角色成功");
    }
}
