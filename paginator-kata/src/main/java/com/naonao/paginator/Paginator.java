package com.naonao.paginator;

/**
 * @author HuangHaodong
 * @create 2018-07-14 4:51 PM
 **/
public class Paginator {


    private final int pageSize;
    private final Object[] content;

    public Paginator(int pageSize, Object[] content) {

        this.pageSize = pageSize;
        this.content = content;
    }

    public Object[] currentPage() {
        return content;
    }
}
