package com.tencent.mig.common;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jiajia
 * @date 2018/5/9
 */
public interface BaseDao<T> {
    int insert(T t);
    int insertList(List<T> list);
    int delete(Serializable id);
    int deleteAll();
    int update(T t);
    T get(Serializable id);

    List<T> getAll();
}
