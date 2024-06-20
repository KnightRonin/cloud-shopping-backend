package com.ithgf.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ithgf.pojo.Admin;

/**
 * @Title: AdminService
 * @Author ithgf
 * @Package com.ithgf.service
 * @Date 2024/6/20 17:02
 * @description: 管理员服务接口
 */
public interface AdminService {
    // 新增管理员
    void add(Admin admin);
    // 修改管理员
    void update(Admin admin);;
    // 删除管理员
    void delete(Long id);
    // 根据id查询管理员
    void findById(Long id);
    // 分页查询管理员
    Page<Admin> search(int page, int size);
    // 修改管理员角色
    void updateRoleToAdmin(Long aid, Long[] rids);

}
