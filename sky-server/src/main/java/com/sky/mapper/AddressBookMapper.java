package com.sky.mapper;

import com.sky.entity.AddressBook;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AddressBookMapper {

    /**
     * 条件查询
     *
     * @param addressBook
     * @return
     */
    List<AddressBook> list(AddressBook addressBook);

    /**
     * 新增
     *
     * @param addressBook
     */
    void insert(AddressBook addressBook);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    AddressBook getById(Long id);

    /**
     * 根据id修改
     *
     * @param addressBook
     */
    void update(AddressBook addressBook);

    /**
     * 根据 用户id修改 是否默认地址
     *
     * @param addressBook
     */
    void updateIsDefaultByUserId(AddressBook addressBook);

    /**
     * 根据id删除地址
     *
     * @param id
     */
    void deleteById(Long id);

}
