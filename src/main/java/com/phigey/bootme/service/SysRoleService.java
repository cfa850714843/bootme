package com.phigey.bootme.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phigey.bootme.dao.entity.SysRoleEntity;

import java.util.List;

/**
 * @author lizf
 */
public interface SysRoleService extends IService<SysRoleEntity> {

    /**
     * 通过用户ID查询角色集合
     *
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
}

