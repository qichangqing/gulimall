package com.qcq.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ֧
 * 
 * @author qichangqing
 * @email 1970165968@qq.com
 * @date 2020-05-17 18:30:49
 */
@Data
@TableName("oms_payment_info")
public class PaymentInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String orderSn;
	/**
	 * 
	 */
	private Long orderId;
	/**
	 * ֧
	 */
	private String alipayTradeNo;
	/**
	 * ֧
	 */
	private BigDecimal totalAmount;
	/**
	 * 
	 */
	private String subject;
	/**
	 * ֧
	 */
	private String paymentStatus;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * ȷ
	 */
	private Date confirmTime;
	/**
	 * 
	 */
	private String callbackContent;
	/**
	 * 
	 */
	private Date callbackTime;

}
