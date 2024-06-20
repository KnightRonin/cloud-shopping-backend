package com.ithgf.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ithgf.pojo.Role;
import com.ithgf.result.BaseResult;
import com.ithgf.service.RoleService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public BaseResult addRole(@RequestBody  Role role){
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

    /**
     * 修改角色
     * @param role 角色对象
     * @return 执行结果
     */
    @PutMapping("/update")
    public BaseResult updateRole(@RequestBody  Role role){
        roleService.update(role);
        return BaseResult.success("修改角色成功");
    }

    /**
     * 根据id查询角色
     * @param rid 角色id
     * @return 执行结果返回
     */
    @GetMapping("/findById/{id}")
    public BaseResult<Role> findById(@PathVariable(name = "id") Long rid){
        Role role = roleService.findById(rid);
        return BaseResult.success(role);
    }

}
