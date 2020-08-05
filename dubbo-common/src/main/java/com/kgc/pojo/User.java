package com.kgc.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;//编号
    private String name;//姓名
    private String address;//地址
    private Integer deptId;//部门编号
    public User(){}
    public User(Integer id, String name, String address, Integer deptId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.deptId = deptId;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
