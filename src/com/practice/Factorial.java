package com.practice;

import java.math.BigInteger;

public class Factorial {

    public static long factorialLong(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialLong(n - 1);
    }

    public static BigInteger factorialBigInteger(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorialBigInteger(n - 1));
    }

    // ДОБАВЬ ЭТО:
    public static void main(String[] args) {
        System.out.println("5! (long) = " + factorialLong(5));
        System.out.println("5! (BigInteger) = " + factorialBigInteger(5));
        System.out.println("20! (long) = " + factorialLong(20));
        System.out.println("21! (BigInteger) = " + factorialBigInteger(21));
    }
}
