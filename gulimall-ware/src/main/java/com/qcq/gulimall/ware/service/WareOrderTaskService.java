package com.qcq.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qcq.common.utils.PageUtils;
import com.qcq.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 
 *
 * @author qichangqing
 * @email 1970165968@qq.com
 * @date 2020-05-17 18:44:36
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

