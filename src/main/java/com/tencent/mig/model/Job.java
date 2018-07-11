package com.tencent.mig.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author jiajia
 */
public class Job {

    @JSONField(name = "i")
    private String id;

    @JSONField(name = "t")
    private String title;

    private String titlePrefix;

    private Integer deptId;

    private String deptName;

    private String subDeptName;

    @JSONField(name = "l")
    private String regionId;

    private String regionName;

    @JSONField(name = "c")
    private String categoryId;

    private String categoryName;

    @JSONField(name = "n")
    private Integer recruitingNumbers;

    @JSONField(name = "h")
    private Byte isUrgentlySeeking;

    @JSONField(name = "u")
    private Date createTime;

    @JSONField(name = "q")
    private String requirment;

    @JSONField(name = "s")
    private String responsibility;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitlePrefix() {
        return titlePrefix;
    }

    public void setTitlePrefix(String titlePrefix) {
        this.titlePrefix = titlePrefix;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSubDeptName() {
        return subDeptName;
    }

    public void setSubDeptName(String subDeptName) {
        this.subDeptName = subDeptName;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getRecruitingNumbers() {
        return recruitingNumbers;
    }

    public void setRecruitingNumbers(Integer recruitingNumbers) {
        this.recruitingNumbers = recruitingNumbers;
    }

    public Byte getIsUrgentlySeeking() {
        return isUrgentlySeeking;
    }

    public void setIsUrgentlySeeking(Byte isUrgentlySeeking) {
        this.isUrgentlySeeking = isUrgentlySeeking;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRequirment() {
        return requirment;
    }

    public void setRequirment(String requirment) {
        this.requirment = requirment;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }
}