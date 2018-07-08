package com.tencent.mig.utils;

import com.tencent.mig.common.NaviPage;
import com.tencent.mig.common.Pager;

import java.io.Serializable;
import java.util.List;

/**
 * @author jiajia
 */
public class NaviPageUtils<T extends Serializable> {

    @Deprecated
    public static NaviPage toNaviPage(List list, Pager page) {
        if (null == list || null == page) {
            return null;
        }
        NaviPage naviPage = new NaviPage<>();
        naviPage.setList(list);
        naviPage.setPager(page);
        return naviPage;
    }


    @Deprecated
    public static NaviPage toNaviPage(List list) {
        if (null == list) {
            return null;
        }
        NaviPage naviPage = new NaviPage<>();
        naviPage.setList(list);
        return naviPage;
    }




/*    public NaviPage toNaviPage(List<T> list, Pager page) {
        NaviPage<T> naviPage = new NaviPage<>();
        naviPage.setList(list);
        naviPage.setPager(page);
        return naviPage;
    }*/
}