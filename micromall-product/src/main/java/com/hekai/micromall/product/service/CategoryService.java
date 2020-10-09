package com.hekai.micromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hekai.common.utils.PageUtils;
import com.hekai.micromall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:04:20
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

