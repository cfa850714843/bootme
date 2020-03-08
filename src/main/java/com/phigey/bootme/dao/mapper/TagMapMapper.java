package com.phigey.bootme.dao.mapper;

import com.phigey.bootme.dao.entity.TagMap;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hanyu
 */

@Mapper
public interface TagMapMapper {

    int insert(TagMap record);

    int insertSelective(TagMap record);
}