package com.qcq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qcq.common.utils.PageUtils;
import com.qcq.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 
 *
 * @author qichangqing
 * @email 1970165968@qq.com
 * @date 2020-05-17 15:10:14
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

