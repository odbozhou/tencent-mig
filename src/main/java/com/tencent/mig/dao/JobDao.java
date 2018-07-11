package com.tencent.mig.dao;

import com.tencent.mig.common.BaseDao;
import com.tencent.mig.model.Department;
import com.tencent.mig.model.Job;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author jiajia
 */
@Component
public interface JobDao extends BaseDao<Job> {

    /**
     * 获取总条数
     *
     * @param job
     * @return
     */
    int getTotal(Job job);

    /**
     * 分页获取招聘信息
     *
     * @param regionId
     * @param categoryId
     * @param pageStartRow
     * @param pageRows
     * @return
     */
    List<Job> getPagerList(@Param("regionId") String regionId, @Param("categoryId") String categoryId, @Param("pageStartRow") int pageStartRow, @Param("pageRows") int pageRows);

    /**
     * 搜索结果总数
     *
     * @param searchKey
     * @return
     */
    int getSearchTotal(@Param("searchKey") String searchKey);

    /**
     * 搜索职位信息
     *
     * @param searchKey
     * @param pageStartRow
     * @param pageRows     @return
     */
    List<Job> search(@Param("searchKey") String searchKey, @Param("pageStartRow") int pageStartRow, @Param("pageRows") int pageRows);

    /**
     * 获取工作详情
     *
     * @param id
     * @return
     */
    Job detail(String id);

    /**
     * 获取热门工作数量
     *
     * @param department
     * @return
     */
    int getHotTotal(Department department);

    /**
     * 取热门工作列表
     *
     * @param deptId
     * @param jobPrefix
     * @param pageStartRow
     * @param pageRows
     * @return
     */
    List<Job> getHotPagerList(@Param("deptId") Integer deptId, @Param("jobPrefix") String jobPrefix, @Param("pageStartRow") int pageStartRow, @Param("pageRows") int pageRows);
}