package com.zcsoft.rc.bms.api.http;

import java.io.Serializable;
import java.util.List;

/**
 * HttpPaginationCondition
 *
 * @author Joly
 * @version v1.0
 * @since v1.0
 * 2018/4/15 下午5:04
 */
public class HttpPaginationCondition <T extends Object> {

    private int pageSize;
    private int currentPage;
    private T condition;

    public HttpPaginationCondition() {

    }

    public HttpPaginationCondition(int pageSize, int currentPage, T condition){
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.condition = condition;
    }

    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public T getCondition() {
        return condition;
    }
    public void setCondition(T condition) {
        this.condition = condition;
    }

}
