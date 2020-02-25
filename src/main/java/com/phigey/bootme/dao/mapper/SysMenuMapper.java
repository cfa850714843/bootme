package com.phigey.bootme.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phigey.bootme.dao.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lizf
 */
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenuEntity> {

    /**
     * 根据角色查询用户权限
     *
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<SysMenuEntity> selectSysMenuByRoleId(Long roleId);

}
