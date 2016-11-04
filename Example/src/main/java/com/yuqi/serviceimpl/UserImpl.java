package com.yuqi.serviceimpl;

import com.yuqi.dto.UserDTO;
import com.yuqi.mapping.UserMapper;
import com.yuqi.pojo.User;
import com.yuqi.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/23
 * Time: 18:36
 * To change this template use File | Settings | File Templates.
 */


@Service("userService")
public class UserImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public UserDTO getUserById(int userId){
        User user = null;
        try {
            user = userMapper.getUserById(userId);

        }catch (Exception e){
            System.out.println(e.getMessage() + "||" + e.getCause());
        }
        return Pojo2DTO(user);
    }

    private UserDTO Pojo2DTO(User user){
        if (user == null)
            return null;

        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        return userDTO;
    }
}
