package com.hekai.micromall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hekai.common.utils.PageUtils;
import com.hekai.micromall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * ??ҳ?ֲ????
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:14:15
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

