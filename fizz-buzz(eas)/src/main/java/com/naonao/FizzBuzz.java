package com.naonao;

/**
 * @author HuangHaodong
 * @create 2018-07-15 10:50 PM
 **/
public class FizzBuzz {

    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int THREE_FIVE = 15;


    public static String getResult(int i) {
        if (i % THREE_FIVE == 0) {
            return "fizzbuzz";
        } else if (i % THREE == 0) {
            return "fizz";
        } else if (i % FIVE == 0) {
            return "buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
