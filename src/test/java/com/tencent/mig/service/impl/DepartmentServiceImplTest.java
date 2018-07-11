package com.tencent.mig.service.impl;

import com.tencent.mig.model.Department;
import com.tencent.mig.service.DepartmentService;
import com.tencent.mig.utils.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zhoubo
 * @create 2018-07-11 19:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DepartmentServiceImplTest {

    @Autowired
    DepartmentService departmentService;

    @Test
    public void importData() throws Exception {
        ExcelUtil<Department> departmentExcelUtil = new ExcelUtil<>(Department.class);
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\zhoubo\\Desktop\\MIG职位代码部门对应.xlsx"));
        final List<Department> sheet1 = departmentExcelUtil.importExcel("Sheet1", inputStream);
        departmentService.saveList(sheet1);
    }

}