package com.practice;

public class SecondTask {

    public static int population(int first, int ratio, int n) {
        if (n == 0) {
            return first;
        }
        return population(first, ratio, n - 1) * ratio;
    }

    public static void main(String[] args) {
        System.out.println("population(2, 3, 3) = " + population(2, 3, 3));
        System.out.println("population(7, 1, 4) = " + population(7, 1, 4));
        System.out.println("population(5, 0, 1) = " + population(5, 0, 1));
        System.out.println("population(5, 0, 3) = " + population(5, 0, 3));
    }
}