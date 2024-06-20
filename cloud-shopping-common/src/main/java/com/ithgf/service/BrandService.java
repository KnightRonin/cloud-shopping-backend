package com.ithgf.service;

import com.ithgf.pojo.Brand;

/**
 * @Title: BrandService
 * @Author ithgf
 * @Package com.ithgf.service
 * @Date 2024/6/20 8:01
 * @description: 品牌服务
 */
public interface BrandService {
    // 根据id查询品牌
    Brand findById(Long id);
}
