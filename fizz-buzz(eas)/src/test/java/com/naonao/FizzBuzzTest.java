package com.naonao;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author HuangHaodong
 * @create 2018-07-15 10:46 PM
 **/
public class FizzBuzzTest {

    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertThat("fizz",is(FizzBuzz.getResult(3)));
        assertThat("fizz",is(FizzBuzz.getResult(6)));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertThat("buzz",is(FizzBuzz.getResult(5)));
        assertThat("buzz",is(FizzBuzz.getResult(10)));
    }

    @Test
    public void getResultShouldReturnFizzBuzzIfTheNumberIsDividable15() {
        assertThat("fizzbuzz",is(FizzBuzz.getResult(15)));
        assertThat("fizzbuzz",is(FizzBuzz.getResult(30)));
    }

    @Test
    public void getResultShoudReturnTheSameNumberIfNoOtherRequirementIsFultfilled() {
        assertThat("1",is(FizzBuzz.getResult(1)));
        assertThat("2",is(FizzBuzz.getResult(2)));
        assertThat("4",is(FizzBuzz.getResult(4)));

    }

}
