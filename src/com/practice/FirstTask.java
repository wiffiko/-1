package com.practice;

public class FirstTask {

    public static int power(int base, int exponent) {
        if (exponent < 0) {
            System.out.println("Ошибка: показатель степени отрицательный");
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println("2^0 = " + power(2, 0));
        System.out.println("2^3 = " + power(2, 3));
        System.out.println("5^1 = " + power(5, 1));
        System.out.println("(-2)^3 = " + power(-2, 3));
    }
}