package com.yuqi.mapping;

import com.yuqi.pojo.User;

import org.apache.ibatis.annotations.Param;
import org.mybatis.pagination.dto.PageMyBatis;
import org.mybatis.pagination.dto.datatables.PagingCriteria;

import java.util.List;

/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/23
 * Time: 18:41
 * To change this template use File | Settings | File Templates.
 */

public interface UserMapper {
    User getUserById(@Param("id") int userId );

}
