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

    /**
     * 添加一个空参的构造器，保证 restTemplate.getForObject 不出错
     */
    public SysUser() {}

    public SysUser(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

}
