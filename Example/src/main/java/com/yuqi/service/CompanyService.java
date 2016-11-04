package com.yuqi.service;

import com.yuqi.dto.CompanyDTO;


import java.util.List;

/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/24
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */

public interface CompanyService {

    CompanyDTO getCompanyById(Integer companyId);
    List<CompanyDTO> list();
}
