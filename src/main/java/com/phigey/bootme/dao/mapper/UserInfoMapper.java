package com.phigey.bootme.dao.mapper;

import com.phigey.bootme.dao.entity.UserInfo;

/**
 * @author cfa
 */
public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_info
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_info
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_info
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_info
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    UserInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_info
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_info
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_info
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    int updateByPrimaryKey(UserInfo record);
}