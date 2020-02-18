package com.phigey.bootme.service.impl;

import com.phigey.bootme.dao.entity.User;
import com.phigey.bootme.dao.mapper.UserMapper;
import com.phigey.bootme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lizf
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int delete(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User select(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }
}
