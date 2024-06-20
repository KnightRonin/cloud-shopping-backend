package com.ithgf.controller;

import com.ithgf.pojo.Brand;
import com.ithgf.result.BaseResult;
import com.ithgf.service.BrandService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: BrandController
 * @Author ithgf
 * @Package com.ithgf.controller
 * @Date 2024/6/20 8:49
 * @description: 品牌查询控制器
 */

@RestController
@RequestMapping("/brand")
public class BrandController {

    @DubboReference
    private BrandService brandService;

    /**
     * 根据id查询品牌
     * @param id
     * @return
     */
    @GetMapping("/findById/{id}")
    public BaseResult<Brand> findById(@PathVariable(name = "id") Long id){
        Brand brand = brandService.findById(id);
        return BaseResult.success(brand);
    }
}
