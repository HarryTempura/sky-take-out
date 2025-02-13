package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper {

    User getByOpenid(String openid);

    /**
     * 插入数据
     *
     * @param user
     */
    void insert(User user);

    /**
     * 根据ID查询用户
     *
     * @param userId
     * @return
     */
    User getById(Long userId);

    /**
     * 根据动态条件统计用户数量
     *
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
