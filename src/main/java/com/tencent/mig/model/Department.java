package com.tencent.mig.model;

import com.tencent.mig.utils.ExcelVOAttribute;

public class Department {

    private Integer id;

    @ExcelVOAttribute(name = "deptId", column = "A", isExport = true, prompt = "必填项")
    private Integer deptId;

    @ExcelVOAttribute(name = "name", column = "B", isExport = true, prompt = "必填项")
    private String name;

    @ExcelVOAttribute(name = "subName", column = "C", isExport = true, prompt = "必填项")
    private String subName;

    @ExcelVOAttribute(name = "jobPrefix", column = "D", isExport = true, prompt = "必填项")
    private String jobPrefix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public String getJobPrefix() {
        return jobPrefix;
    }

    public void setJobPrefix(String jobPrefix) {
        this.jobPrefix = jobPrefix == null ? null : jobPrefix.trim();
    }
}