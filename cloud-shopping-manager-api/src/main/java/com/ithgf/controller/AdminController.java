package com.ithgf.controller;

import com.ithgf.pojo.Admin;
import com.ithgf.result.BaseResult;
import com.ithgf.service.AdminService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

/**
 * @Title: AdminController
 * @Author ithgf
 * @Package com.ithgf.controller
 * @Date 2024/6/20 17:24
 * @description: 管理员服务接口
 */

@RestController
@RequestMapping("/admin")
public class AdminController {

    @DubboReference
    private AdminService adminService;

    // 添加管理员
    @PostMapping("/add")
    public BaseResult<Admin> add(@RequestBody Admin admin){
        adminService.add(admin);
        return BaseResult.success("添加管理员成功");
    }
    // 更新管理员
    // 删除管理员
    // 根据id查询管理员
    // 分页查询管理员
    // 管理员添加角色
}
