package com.naonao.paginator;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author HuangHaodong
 * @create 2018-07-14 4:45 PM
 **/

public class PaginatorTest {


    private Object[] SIZE5_CONTENT = {1, 2, 3, 4, 5};

    private Object[] of(Object... values) {
        return values;
    }

    @Test
    public void startOnFirstPage() {
        Paginator paginator = new Paginator(5, SIZE5_CONTENT);
        Object[] firstPage = paginator.currentPage();
        assertThat(firstPage, is(of(1, 2, 3, 4, 5)));
    }

    @Test
    public void itShouldOnlyReturnFirstPageNotAllContent() {
        Paginator paginator = new Paginator(2,SIZE5_CONTENT);
        Object[] firstPage = paginator.currentPage();
        assertThat(firstPage, is(of(1,2)));

    }

    @Test
    public void nextPageReturnsCurrentContent() {
        Paginator paginator = new Paginator(2,SIZE5_CONTENT);
        paginator.next();
        Object[] currentPage = paginator.currentPage();
        assertThat(currentPage, is(of(3,4)));
    }

    @Test
    public void doesNotHaveNextWhenOnLastPage() {
        Paginator paginator = new Paginator(SIZE5_CONTENT.length,SIZE5_CONTENT);
        assertThat(paginator.hasNext(),is(false));
    }

    @Test
    public void doesHaveNextWhenOnFirstOf3Pages() {
        Paginator paginator = new Paginator(2,SIZE5_CONTENT);
        assertThat(paginator.hasNext(),is(true));
    }

    @Test
    public void doesNotHavePreviousInitially() {
        Paginator paginator = new Paginator(2,SIZE5_CONTENT);
        assertThat(paginator.hasPrevious(),is(false));
    }

    @Test
    public void doesHavePreviousIfOnSecondPage() {
        Paginator paginator = new Paginator(2,SIZE5_CONTENT);
        paginator.next();
        assertThat(paginator.hasPrevious(),is(true));
    }

    @Test
    public void previousFromSecondPageResultsInFirstPage() {
        Paginator paginator = new Paginator(2,SIZE5_CONTENT);
        paginator.next();
        paginator.previous();
        Object[] currentPage = paginator.currentPage();
        assertThat(currentPage, is(of(1,2)));




    }


}
