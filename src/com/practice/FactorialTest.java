package com.practice;

import java.math.BigInteger;

public class FactorialTest {

    public static void main(String[] args) {
        System.out.println("=== Тесты Factorial ===\n");

        // Базовый случай рекурсии
        test("factorialLong(0) == 1", Factorial.factorialLong(0), 1L);
        test("factorialLong(1) == 1", Factorial.factorialLong(1), 1L);
        test("factorialBigInteger(0) == 1", Factorial.factorialBigInteger(0), BigInteger.ONE);
        test("factorialBigInteger(1) == 1", Factorial.factorialBigInteger(1), BigInteger.ONE);

        // Рекурсивный случай (несколько кейсов)
        test("factorialLong(2) == 2", Factorial.factorialLong(2), 2L);
        test("factorialLong(3) == 6", Factorial.factorialLong(3), 6L);
        test("factorialLong(4) == 24", Factorial.factorialLong(4), 24L);
        test("factorialLong(5) == 120", Factorial.factorialLong(5), 120L);
        test("factorialLong(10) == 3628800", Factorial.factorialLong(10), 3628800L);

        test("factorialBigInteger(5) == 120", Factorial.factorialBigInteger(5), BigInteger.valueOf(120));
        test("factorialBigInteger(10) == 3628800", Factorial.factorialBigInteger(10), BigInteger.valueOf(3628800));

        // Сравнение long и BigInteger — поиск переполнения
        System.out.println("\n=== Сравнение long и BigInteger ===");
        int overflowN = -1;
        for (int n = 0; n <= 25; n++) {
            long longResult = Factorial.factorialLong(n);
            BigInteger bigResult = Factorial.factorialBigInteger(n);
            if (BigInteger.valueOf(longResult).equals(bigResult)) {
                System.out.println("n=" + n + ": совпадают ✓");
            } else {
                System.out.println("n=" + n + ": ПЕРЕПОЛНЕНИЕ long!");
                System.out.println("  long:       " + longResult);
                System.out.println("  BigInteger: " + bigResult);
                if (overflowN == -1) overflowN = n;
            }
        }
        System.out.println("\nПереполнение long начинается при n = " + overflowN);
    }

    static void test(String name, long actual, long expected) {
        if (actual == expected) {
            System.out.println("✓ " + name);
        } else {
            System.out.println("✗ " + name + " (ожидается " + expected + ", получено " + actual + ")");
        }
    }

    static void test(String name, BigInteger actual, BigInteger expected) {
        if (actual.equals(expected)) {
            System.out.println("✓ " + name);
        } else {
            System.out.println(" " + name + " (ожидается " + expected + ", получено " + actual + ")");
        }
    }
}