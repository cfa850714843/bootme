package com.phigey.bootme.service.impl;

import com.phigey.bootme.dao.entity.User;
import com.phigey.bootme.service.TestService;
import com.phigey.bootme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lizf
 */

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserService userService;

    @Override
    public void test() {
        User user;
        for (int i = 1; i <= 15; i++) {
            user = userService.select(i);
            System.out.println(user);
        }
    }
}
