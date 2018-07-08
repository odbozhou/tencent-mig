package com.tencent.mig.common;


import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Administrator
 * @date 2015/5/5
 */
public class NaviPage<T> implements Serializable {


    private List<T> list;

    private Pager pager;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }
}
