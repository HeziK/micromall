package com.hekai.micromall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hekai.common.utils.PageUtils;
import com.hekai.micromall.member.entity.MemberEntity;

import java.util.Map;

/**
 * ??Ա
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:12:15
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

