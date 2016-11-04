package com.yuqi.serviceimpl;

import com.sun.javafx.image.IntPixelGetter;
import com.yuqi.dto.CompanyDTO;
import com.yuqi.mapping.CompanyMapper;
import com.yuqi.pojo.Company;
import com.yuqi.service.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/24
 * Time: 20:36
 * To change this template use File | Settings | File Templates.
 */

@Service("companyService")
public class CompanyImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    public CompanyDTO getCompanyById(Integer companyId){

        Company company = null;
        try {

            company = companyMapper.getCompanyById(companyId);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "|" + e.getCause());
        }
        return Pojo2DTO(company);
    }

    public List<CompanyDTO> list(){
        List<Company> companyList= companyMapper.list();

        if (companyList == null || companyList.size() == 0){
            return null;
        }

        List<CompanyDTO> companyDTOList = new ArrayList<CompanyDTO>();
        for(Company company: companyList){
            companyDTOList.add(Pojo2DTO(company));
        }

        return companyDTOList;
    }


    private CompanyDTO Pojo2DTO(Company company){
        if (company == null){
            return null;
        }

        CompanyDTO companyDTO = new CompanyDTO();

        companyDTO.setCityId(company.getCityId());
        companyDTO.setCompanyAddress(company.getCompanyAddress());
        companyDTO.setCompanyAverageSalary(company.getCompanyAverageSalary());
        companyDTO.setCompanyBg(company.getCompanyBg());
        companyDTO.setCompanyCommentScore(company.getCompanyCommentScore());

        companyDTO.setCompanyFoundTime(company.getCompanyFoundDate());
        companyDTO.setCompanyFullName(company.getCompanyFullName());
        companyDTO.setCompanyIntro(company.getCompanyIntro());
        companyDTO.setCompanyLogo(company.getCompanyLogo());
        companyDTO.setCompanyName(company.getCompanyName());

        companyDTO.setCompanyScale(company.getCompanyScale());
        companyDTO.setCourseId(company.getCourseId());
        companyDTO.setIndustryId(company.getIndustryId());
        companyDTO.setCompanyCommentScore(company.getCompanyCommentScore());
        companyDTO.setCompanyTag(company.getCompanyTag());

        companyDTO.setCompanySite(company.getCompanySite());
        companyDTO.setCompanyAverageSalary(company.getCompanyAverageSalary());

        return companyDTO;
    }

}
