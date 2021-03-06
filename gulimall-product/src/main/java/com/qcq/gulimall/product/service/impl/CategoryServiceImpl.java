package com.qcq.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qcq.common.utils.PageUtils;
import com.qcq.common.utils.Query;

import com.qcq.gulimall.product.dao.CategoryDao;
import com.qcq.gulimall.product.entity.CategoryEntity;
import com.qcq.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listAll() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> parentCategories = entities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity,entities));
            return categoryEntity;
        }).sorted((menu1,menu2)->(menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort())).collect(Collectors.toList());
        return parentCategories;
    }

    @Override
    public void removeMenuByIds(Long[] catIds) {
        //TODO 根据id搜索被引用的删除
        baseMapper.deleteBatchIds(Arrays.asList(catIds));
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream().filter(categoryEntity -> categoryEntity.getParentCid()==root.getCatId()).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2)->(menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort())).collect(Collectors.toList());
    }

}