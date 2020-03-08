package com.phigey.bootme.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hanyu
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -3364259060389901283L;

    private Long id;

    private String name;

    private Integer sex;

    private String email;

    private String job;

    private String provinceCode;

    private String cityCode;

    private Date createTime;

    private Date updateTime;

    private String resume;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.id
     *
     * @return the value of tb_user_info.id
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.id
     *
     * @param id the value for tb_user_info.id
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.name
     *
     * @return the value of tb_user_info.name
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.name
     *
     * @param name the value for tb_user_info.name
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.sex
     *
     * @return the value of tb_user_info.sex
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.sex
     *
     * @param sex the value for tb_user_info.sex
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.email
     *
     * @return the value of tb_user_info.email
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.email
     *
     * @param email the value for tb_user_info.email
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.job
     *
     * @return the value of tb_user_info.job
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.job
     *
     * @param job the value for tb_user_info.job
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.province_code
     *
     * @return the value of tb_user_info.province_code
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.province_code
     *
     * @param provinceCode the value for tb_user_info.province_code
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.city_code
     *
     * @return the value of tb_user_info.city_code
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.city_code
     *
     * @param cityCode the value for tb_user_info.city_code
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.create_time
     *
     * @return the value of tb_user_info.create_time
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.create_time
     *
     * @param createTime the value for tb_user_info.create_time
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.update_time
     *
     * @return the value of tb_user_info.update_time
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.update_time
     *
     * @param updateTime the value for tb_user_info.update_time
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_info.resume
     *
     * @return the value of tb_user_info.resume
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public String getResume() {
        return resume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_info.resume
     *
     * @param resume the value for tb_user_info.resume
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }
}