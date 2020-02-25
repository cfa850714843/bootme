package com.phigey.bootme.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phigey.bootme.dao.entity.SysRoleEntity;
import com.phigey.bootme.dao.mapper.SysRoleMapper;
import com.phigey.bootme.service.SysRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lizf
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRoleEntity> implements SysRoleService {

    /**
     * 通过用户ID查询角色集合
     * @Author Sans
     * @CreateTime 2019/6/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    @Override
    public List<SysRoleEntity> selectSysRoleByUserId(Long userId) {
        return this.baseMapper.selectSysRoleByUserId(userId);
    }
}