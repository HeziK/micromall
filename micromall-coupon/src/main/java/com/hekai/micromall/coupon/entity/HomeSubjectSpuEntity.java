package com.hekai.micromall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * ר????Ʒ
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:14:16
 */
@Data
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ר?????
     */
    private String name;
    /**
     * ר??id
     */
    private Long subjectId;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * ???
     */
    private Integer sort;

}
