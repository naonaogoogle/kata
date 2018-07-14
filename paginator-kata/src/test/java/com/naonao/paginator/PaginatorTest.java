package com.naonao.paginator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author HuangHaodong
 * @create 2018-07-14 4:45 PM
 **/

public class PaginatorTest {


    @Test
    public void startOnFirstPage() {
        Paginator paginator = new Paginator(5, new Object[]{1, 2, 3, 4, 5});
        Object[] firstPage = paginator.currentPage();
        assertThat(firstPage, is(new Object[]{1, 2, 3, 4, 5}));

    }


}
