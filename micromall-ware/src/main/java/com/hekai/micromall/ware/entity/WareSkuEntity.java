package com.hekai.micromall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * ??Ʒ???
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:15:42
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * ?ֿ?id
     */
    private Long wareId;
    /**
     * ??????
     */
    private Integer stock;
    /**
     * sku_name
     */
    private String skuName;
    /**
     * ???????
     */
    private Integer stockLocked;

}
