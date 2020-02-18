package com.phigey.bootme.dao.mapper;
import java.util.List;

import com.phigey.bootme.dao.entity.People;
import com.phigey.bootme.dao.entity.PeopleExample;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(People record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(People record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<People> selectByExample(PeopleExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    People selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(People record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(People record);
}