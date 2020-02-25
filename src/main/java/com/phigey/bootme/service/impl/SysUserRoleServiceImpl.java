package com.phigey.bootme.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phigey.bootme.dao.entity.SysUserRoleEntity;
import com.phigey.bootme.dao.mapper.SysUserRoleMapper;
import com.phigey.bootme.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * @author lizf
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRoleEntity> implements SysUserRoleService {

}
