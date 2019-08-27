package com.ly.springcloud.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 系统用户
 *
 * @author ashitaka
 */
@Data
public class SysUser implements Serializable {

    private Long id;
    private String name;
    private String password;

    public SysUser(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

}
