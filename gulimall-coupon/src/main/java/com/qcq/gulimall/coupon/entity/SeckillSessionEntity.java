package com.qcq.gulimall.coupon.entity;

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
 * @date 2020-05-17 18:08:25
 */
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String name;
	/**
	 * ÿ
	 */
	private Date startTime;
	/**
	 * ÿ
	 */
	private Date endTime;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private Date createTime;

}
