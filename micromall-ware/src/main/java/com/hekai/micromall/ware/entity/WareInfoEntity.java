package com.hekai.micromall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * ?ֿ???Ϣ
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:15:42
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ?ֿ???
     */
    private String name;
    /**
     * ?ֿ???ַ
     */
    private String address;
    /**
     * ???????
     */
    private String areacode;

}
