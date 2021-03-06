package com.phigey.bootme.dao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hanyu
 */
public class Tag implements Serializable {
    private static final long serialVersionUID = 590654911197963917L;
    private Long id;
    private String name;
    private Integer type;
    private Long userId;
    private Integer openType;
    private Date createTime;
    private Date updateTime;
    private String tagContent;

    public Tag() {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tag.id
     *
     * @return the value of tb_tag.id
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tag.id
     *
     * @param id the value for tb_tag.id
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tag.name
     *
     * @return the value of tb_tag.name
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tag.name
     *
     * @param name the value for tb_tag.name
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tag.type
     *
     * @return the value of tb_tag.type
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tag.type
     *
     * @param type the value for tb_tag.type
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tag.user_id
     *
     * @return the value of tb_tag.user_id
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tag.user_id
     *
     * @param userId the value for tb_tag.user_id
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tag.open_type
     *
     * @return the value of tb_tag.open_type
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Integer getOpenType() {
        return openType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tag.open_type
     *
     * @param openType the value for tb_tag.open_type
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setOpenType(Integer openType) {
        this.openType = openType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tag.create_time
     *
     * @return the value of tb_tag.create_time
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tag.create_time
     *
     * @param createTime the value for tb_tag.create_time
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tag.update_time
     *
     * @return the value of tb_tag.update_time
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tag.update_time
     *
     * @param updateTime the value for tb_tag.update_time
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_tag.tag_content
     *
     * @return the value of tb_tag.tag_content
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public String getTagContent() {
        return tagContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_tag.tag_content
     *
     * @param tagContent the value for tb_tag.tag_content
     *
     * @mbg.generated Sun Mar 08 15:04:18 CST 2020
     */
    public void setTagContent(String tagContent) {
        this.tagContent = tagContent == null ? null : tagContent.trim();
    }
}