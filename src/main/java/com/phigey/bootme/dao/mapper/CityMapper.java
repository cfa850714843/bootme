package com.phigey.bootme.dao.mapper;

import com.phigey.bootme.dao.entity.City;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author cfa
 */

@Mapper
public interface CityMapper {

    int deleteByPrimaryKey(String code);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}