package com.ithgf.service;

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
    @Override
    public void add(Admin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public void update(Admin admin) {
        adminMapper.updateById(admin);

    }

    /**
     * 删除用户所有角色，在删除管理员
     * @param aid
     */
    @Override
    public void delete(Long aid) {
        adminMapper.deleteAdminAllRole(aid);
        adminMapper.deleteById(aid);

    }

    @Override
    public Admin findById(Long id) {
        return null;
    }

    @Override
    public Page<Admin> search(int page, int size) {
        return null;
    }

    @Override
    public void updateRoleToAdmin(Long aid, Long[] rids) {

    }
}
