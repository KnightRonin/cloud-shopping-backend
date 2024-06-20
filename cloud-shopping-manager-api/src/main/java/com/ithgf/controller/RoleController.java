package com.ithgf.controller;

import com.ithgf.pojo.Role;
import com.ithgf.result.BaseResult;
import com.ithgf.service.RoleService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Title: 角色管理
 * @Author ithgf
 * @Package com.ithgf.controller
 * @Date 2024/6/20 21:38
 * @description: 角色管理
 */

@RestController
@RequestMapping("/role")
public class RoleController {

    @DubboReference
    private RoleService roleService;

    /**
     * 新增角色
     * @param role 角色对象
     */
    @PostMapping("/add")
    public BaseResult addRole(Role role){
        roleService.add(role);
        return BaseResult.success("添加角色成功");
    }

    /**
     * 删除角色
     * @param rid 角色id
     * @return 执行结果
     */
    @DeleteMapping("/delete/{id}")
    public BaseResult deleteRole(@PathVariable(name = "id") Long rid){
        roleService.delete(rid);
        return BaseResult.success("删除角色成功");
    }


}
