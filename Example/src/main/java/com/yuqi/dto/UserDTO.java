package com.yuqi.dto;

/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/23
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */

public class UserDTO {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
