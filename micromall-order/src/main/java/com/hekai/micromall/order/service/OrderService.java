package com.hekai.micromall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hekai.common.utils.PageUtils;
import com.hekai.micromall.order.entity.OrderEntity;

import java.util.Map;

/**
 * ????
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:10:24
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

