package com.qcq.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qcq.common.utils.PageUtils;
import com.qcq.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 
 *
 * @author qichangqing
 * @email 1970165968@qq.com
 * @date 2020-05-17 18:39:12
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

