package cn.cqut.bookmangement.util;


import lombok.ToString;

import java.util.List;

@ToString
public abstract class PageHelper<T> {
    private List<T> data;
    private Integer firstPage = 1;
    private Integer prePage;
    private Integer currentPage = 1;
    private Integer nextPage;
    private Integer totalPage;            //总页数 末页
    private Integer count;                //总条数
    private Integer pageSize = 6;        //每页多少条
    private Integer start = 0;

    public Integer getStart() {
        return (currentPage - 1) * pageSize;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(Integer firstPage) {
        this.firstPage = firstPage;
    }

    public Integer getPrePage() {
        return currentPage - 1 <= 0 ? 1 : currentPage - 1;
    }

    public void setPrePage(Integer prePage) {
        this.prePage = prePage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getNextPage() {
        return currentPage + 1 > totalPage ? totalPage : currentPage + 1;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public Integer getTotalPage() {
        return count % pageSize != 0 ? count / pageSize + 1 : count / pageSize;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getEnd() {
        return getStart() + getPageSize();
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public static PageHelper generateCheckedHelper(int count, PageHelper pageHelper) {
        if (pageHelper == null)
            return pageHelper;
        pageHelper.setCount(count);

        if (pageHelper.getPageSize() == null || pageHelper.getPageSize() <= 1)
            pageHelper.setPageSize(10);
        pageHelper.setTotalPage(pageHelper.getTotalPage());

        if (pageHelper.getCurrentPage() == null || pageHelper.getCurrentPage() <= 0)
            pageHelper.setCurrentPage(1);
        if (pageHelper.currentPage > pageHelper.totalPage)
            pageHelper.setCurrentPage(pageHelper.totalPage);
        if (pageHelper.getCurrentPage() == null || pageHelper.getCurrentPage() <= 0)
            pageHelper.setCurrentPage(1);
        return pageHelper;

    }
}
