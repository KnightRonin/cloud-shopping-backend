package com.ithgf.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ithgf.mapper.AdminMapper;
import com.ithgf.pojo.Admin;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: AdminService
 * @Author ithgf
 * @Package com.ithgf.service
 * @Date 2024/6/20 17:08
 * @description: 管理员服务接口实现
 */

@DubboService
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 新增管理员
     * @param admin 管理员对象
     */
    @Override
    public void add(Admin admin) {
        adminMapper.insert(admin);
    }

    /**
     * 根据修改管理员
     * @param admin
     */
    @Override
    public void update(Admin admin) {
        adminMapper.updateById(admin);

    }

    /**
     * 删除用户所有角色，再删除管理员
     * @param aid
     */
    @Override
    public void delete(Long aid) {
        adminMapper.deleteAdminAllRole(aid);
        adminMapper.deleteById(aid);

    }

    /**
     * 根据id查询管理员
     * @param aid 管理员id
     * @return
     */
    @Override
    public Admin findById(Long aid) {
       return adminMapper.findById(aid);
    }

    /**
     * 管理员分页查询
     * @param page 页码
     * @param size 条数
     * @return
     */
    @Override
    public Page<Admin> search(int page, int size) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        return adminMapper.selectPage(new Page<>(page, size), null);

    }

    /**
     * 修改管理员角色
     * @param aid 管理员id
     * @param rids 管理员角色列表
     */
    @Override
    public void updateRoleToAdmin(Long aid, Long[] rids) {
        // 删除用户所有角色
        adminMapper.deleteAdminAllRole(aid);
        // 添加角色
        for (Long rid : rids) {
            adminMapper.addRoleToAdmin(aid,rid);
        }
    }
}
