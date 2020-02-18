package com.phigey.bootme.dao.entity;

import lombok.Data;

/**
 * Table: people
 * @author lizf
 */
@Data
public class People {
    /**
     * Column: id
     * Remark: people id
     */
    private Integer id;

    /**
     * Column: name
     * Remark: people name
     */
    private String name;

    /**
     * Column: job
     * Remark: people job
     */
    private String job;

    /**
     * Column: phone_number
     * Remark: people phone number
     */
    private String phoneNumber;

    /**
     * Column: ip
     * Remark: people ip
     */
    private String ip;

    /**
     * Column: company
     * Remark: people company
     */
    private String company;

    /**
     * Column: email
     * Remark: people email
     */
    private String email;

    /**
     * Column: address
     * Remark: people address
     */
    private String address;
}