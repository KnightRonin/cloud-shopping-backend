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

    /**
     * 添加管理员
     * @param admin 管理员对象
     * @return 执行结果
     */
    @PostMapping("/add")
    public BaseResult<Admin> add(@RequestBody Admin admin){
        adminService.add(admin);
        return BaseResult.success("添加管理员成功");
    }

    /**
     *  根据ID修改管理员
     * @param admin 管理员对象
     * @return 执行结果
     */
    @PutMapping("/update")
    public BaseResult<Admin> update(@RequestBody Admin admin){
        adminService.update(admin);
        return BaseResult.success("修改管理员成功");
    }
    // 删除管理员
    // 根据id查询管理员
    // 分页查询管理员
    // 管理员添加角色
}
