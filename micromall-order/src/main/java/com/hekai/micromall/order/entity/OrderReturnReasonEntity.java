package com.hekai.micromall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * ?˻?ԭ?
 *
 * @author hekai
 * @email hezikai90@163.com
 * @date 2020-10-05 23:10:24
 */
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ?˻?ԭ?
     */
    private String name;
    /**
     * ???
     */
    private Integer sort;
    /**
     * ????״̬
     */
    private Integer status;
    /**
     * create_time
     */
    private Date createTime;

}
