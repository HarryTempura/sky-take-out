package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品ID查询套餐ID
     *
     * @param ids
     * @return
     */
    public List<Long> getSetmealIdsByDishIds(List<Long> ids);

}