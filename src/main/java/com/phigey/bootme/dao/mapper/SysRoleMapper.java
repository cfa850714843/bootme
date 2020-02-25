package com.phigey.bootme.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phigey.bootme.dao.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lizf
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRoleEntity> {

    /**
     * 通过用户ID查询角色集合
     *
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);

}