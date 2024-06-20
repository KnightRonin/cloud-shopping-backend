package com.ithgf.service;

import com.ithgf.mapper.BrandMapper;
import com.ithgf.pojo.Brand;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: BrandServiceImpl
 * @Author ithgf
 * @Package com.ithgf.service
 * @Date 2024/6/20 8:03
 * @description: 品牌服务实现类
 */

@DubboService
@Transactional
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandMapper brandMapper;

    /**
     * 根据id查看品牌
     * @param id
     * @return
     */
    @Override
    public Brand findById(Long id) {
        return brandMapper.selectById(id);
    }
}
