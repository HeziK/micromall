package com.hekai.micromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hekai.common.utils.PageUtils;
import com.hekai.micromall.product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ?
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:04:20
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

