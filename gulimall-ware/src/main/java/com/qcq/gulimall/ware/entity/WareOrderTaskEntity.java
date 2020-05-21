package com.qcq.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author qichangqing
 * @email 1970165968@qq.com
 * @date 2020-05-17 18:44:36
 */
@Data
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * order_id
	 */
	private Long orderId;
	/**
	 * order_sn
	 */
	private String orderSn;
	/**
	 * 
	 */
	private String consignee;
	/**
	 * 
	 */
	private String consigneeTel;
	/**
	 * 
	 */
	private String deliveryAddress;
	/**
	 * 
	 */
	private String orderComment;
	/**
	 * 
	 */
	private Integer paymentWay;
	/**
	 * 
	 */
	private Integer taskStatus;
	/**
	 * 
	 */
	private String orderBody;
	/**
	 * 
	 */
	private String trackingNo;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Long wareId;
	/**
	 * 
	 */
	private String taskComment;

}
