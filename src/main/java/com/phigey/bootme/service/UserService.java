package com.phigey.bootme.service;

import com.phigey.bootme.dao.entity.User;

/**
 * @author lizf
 */
public interface UserService {
    /**
     * delete
     *
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * insert
     *
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * select
     *
     * @param id
     * @return
     */
    User select(Integer id);

    /**
     * update
     *
     * @param record
     * @return
     */
    int update(User record);
}
