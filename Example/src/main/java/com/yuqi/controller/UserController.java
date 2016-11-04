package com.yuqi.controller;

import com.alibaba.fastjson.JSONObject;
import com.yuqi.dto.UserDTO;
import com.yuqi.mapping.UserMapper;
import com.yuqi.pojo.User;
import com.yuqi.service.UserService;

import org.mybatis.pagination.dto.PageMyBatis;
import org.mybatis.pagination.dto.datatables.PagingCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/23
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/showUser")
    @ResponseBody
    public JSONObject getUser(HttpServletRequest request, @RequestParam("userId") Integer userId){
        JSONObject jsonObject = new JSONObject();

        UserDTO user = userService.getUserById(userId);
        jsonObject.put("code",200);
        jsonObject.put("value",user);
        return jsonObject;
    }
}
