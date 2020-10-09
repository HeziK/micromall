package com.hekai.micromall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hekai.common.utils.PageUtils;
import com.hekai.micromall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * ?˿???Ϣ
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:10:24
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

