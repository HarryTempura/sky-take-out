package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量提添加口味数据
     *
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品ID删除菜品口味数据
     *
     * @param dishId
     */
    void deleteByDishId(Long dishId);

    /**
     * 根据IDs菜品集合批量删除口味数据
     */
    void deleteByDishIds(List<Long> dishIds);

    /**
     * 根据ID查询菜品的口味数据
     *
     * @param dishId
     * @return
     */
    List<DishFlavor> getByDishId(Long dishId);
}
