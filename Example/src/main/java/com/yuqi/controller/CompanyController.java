package com.yuqi.controller;

import com.alibaba.fastjson.JSONObject;
import com.yuqi.service.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.jasperreports.JasperReportsCsvView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/24
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("allcompanys")
    @ResponseBody
    public JSONObject listCompany(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("value",companyService.list());
        return jsonObject;
    }

    @RequestMapping("/findcompany")
    @ResponseBody
    public JSONObject getCompanyById(HttpServletRequest request,@RequestParam("companyId") String companyId){

        JSONObject jsonObject = new JSONObject();
        Integer id = Integer.valueOf(companyId);
        jsonObject.put("code",200);
        jsonObject.put("value",companyService.getCompanyById(id));
        return jsonObject;
    }


}
