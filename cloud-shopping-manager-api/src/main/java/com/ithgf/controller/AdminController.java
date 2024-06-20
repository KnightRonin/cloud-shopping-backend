package com.ithgf.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ithgf.pojo.Admin;
import com.ithgf.pojo.Permission;
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
    public BaseResult update(@RequestBody Admin admin){
        adminService.update(admin);
        return BaseResult.success("修改管理员成功");
    }

    /**
     *  删除管理员
     * @param aid 管理员id
     * @return 执行结果
     */

    @DeleteMapping("/delete/{id}")
    public BaseResult delete(@PathVariable(name = "id") Long aid){
        adminService.delete(aid);
        return BaseResult.success("删除管理员成功");
    }

    /**
     * 根据id查询管理员
     * @param aid
     * @return
     */
    @GetMapping("/findById/{id}")
    public BaseResult<Admin> findById(@PathVariable(name = "id") Long aid){
        Admin admin = adminService.findById(aid);
        return BaseResult.success(admin);
    }

    /**
     *  分页查询管理员
     * @param page 页码
     * @param size 每页条数
     * @return 执行结果
     */

    @GetMapping("/search")
    public BaseResult<Page<Admin>> search(int page, int size){
        Page<Admin> pageSearch = adminService.search(page, size);
        return BaseResult.success(pageSearch);

    }

    // 管理员添加角色
}
