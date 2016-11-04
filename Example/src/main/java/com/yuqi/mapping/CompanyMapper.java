package com.yuqi.mapping;

import com.yuqi.pojo.Company;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/24
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */

public interface CompanyMapper {
    Company getCompanyById(@Param("companyId") Integer companyId);
    List<Company> list();
}
