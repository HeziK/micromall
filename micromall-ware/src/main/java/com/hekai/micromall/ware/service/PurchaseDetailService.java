package com.hekai.micromall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hekai.common.utils.PageUtils;
import com.hekai.micromall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:15:42
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

