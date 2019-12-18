package com.qingcheng.service.goods;

import com.qingcheng.pojo.goods.Brand;

import java.util.List;

/**
 * @description:
 * @author: xiekecheng
 * @since: 2019-12-18 23:38
 **/
public interface BrandService {
    /**
     * 查询所有商品
     * @return
     */
    List<Brand> findAll();
}
