package com.phigey.bootme.dao.mapper;

import com.phigey.bootme.dao.entity.User;
import com.phigey.bootme.dao.entity.UserExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lizf
 */

@Mapper
public interface UserMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    User selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(User record);
}