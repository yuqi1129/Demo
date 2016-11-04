package com.yuqi.dto;

import java.util.Date;

/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/24
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */

public class CompanyDTO {

    private Integer companyId;
    private String companyName;
    private String companyScale;
    private String companyIntro;

    private String companyLogo;
    private String companyTag;
    private String companyBg;

    private String companySite;

    private Double companyCommentScore;
    private Double companyAverageSalary;

    private Date companyFoundTime;
    private String companyAddress;

    private Integer cityId;
    private Integer  industryId;

    private Integer courseId;
    private String companyFullName;
    private String companyCategory;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyScale() {
        return companyScale;
    }

    public void setCompanyScale(String companyScale) {
        this.companyScale = companyScale;
    }

    public String getCompanyIntro() {
        return companyIntro;
    }

    public void setCompanyIntro(String companyIntro) {
        this.companyIntro = companyIntro;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyTag() {
        return companyTag;
    }

    public void setCompanyTag(String companyTag) {
        this.companyTag = companyTag;
    }

    public String getCompanyBg() {
        return companyBg;
    }

    public void setCompanyBg(String companyBg) {
        this.companyBg = companyBg;
    }

    public String getCompanySite() {
        return companySite;
    }

    public void setCompanySite(String companySite) {
        this.companySite = companySite;
    }

    public Double getCompanyCommentScore() {
        return companyCommentScore;
    }

    public void setCompanyCommentScore(Double companyCommentScore) {
        this.companyCommentScore = companyCommentScore;
    }

    public Double getCompanyAverageSalary() {
        return companyAverageSalary;
    }

    public void setCompanyAverageSalary(Double companyAverageSalary) {
        this.companyAverageSalary = companyAverageSalary;
    }

    public Date getCompanyFoundTime() {
        return companyFoundTime;
    }

    public void setCompanyFoundTime(Date companyFoundTime) {
        this.companyFoundTime = companyFoundTime;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public String getCompanyCategory() {
        return companyCategory;
    }

    public void setCompanyCategory(String companyCategory) {
        this.companyCategory = companyCategory;
    }
}
