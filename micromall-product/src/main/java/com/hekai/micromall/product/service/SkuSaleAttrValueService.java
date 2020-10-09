package com.hekai.micromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hekai.common.utils.PageUtils;
import com.hekai.micromall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku????????&ֵ
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:04:20
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

