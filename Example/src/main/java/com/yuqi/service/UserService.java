package com.yuqi.service;

import com.yuqi.dto.UserDTO;
import com.yuqi.pojo.User;

import org.mybatis.pagination.dto.PageMyBatis;

import java.util.List;


/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/23
 * Time: 18:34
 * To change this template use File | Settings | File Templates.
 */

public interface UserService {
    public UserDTO getUserById(int userId);
}
