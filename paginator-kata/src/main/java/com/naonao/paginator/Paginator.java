package com.naonao.paginator;

import java.util.Arrays;

/**
 * @author HuangHaodong
 * @create 2018-07-14 4:51 PM
 **/
public class Paginator {


    private final int pageSize;
    private final Object[] content;
    private int currentStart;

    public Paginator(int pageSize, Object[] content) {

        this.pageSize = pageSize;
        this.content = content;
    }

    public Object[] currentPage() {
        return Arrays.copyOfRange(content, currentStart, currentStart + pageSize);
    }

    public void next() {
        currentStart += pageSize;

    }

    public boolean hasNext() {
        return currentStart + pageSize < content.length;
    }
}
