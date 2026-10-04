package com.practice;

public class FirstTaskTest {

    public static void main(String[] args) {
        System.out.println("=== Тесты FirstTask (power) ===\n");

        // Базовый случай рекурсии
        test("power(2, 0) == 1", FirstTask.power(2, 0), 1);
        test("power(5, 0) == 1", FirstTask.power(5, 0), 1);
        test("power(-3, 0) == 1", FirstTask.power(-3, 0), 1);

        // Рекурсивный случай (несколько кейсов)
        test("power(2, 3) == 8", FirstTask.power(2, 3), 8);
        test("power(5, 1) == 5", FirstTask.power(5, 1), 5);
        test("power(-2, 3) == -8", FirstTask.power(-2, 3), -8);
        test("power(3, 2) == 9", FirstTask.power(3, 2), 9);
        test("power(4, 3) == 64", FirstTask.power(4, 3), 64);
        test("power(10, 2) == 100", FirstTask.power(10, 2), 100);
        test("power(-3, 2) == 9", FirstTask.power(-3, 2), 9);
        test("power(-3, 3) == -27", FirstTask.power(-3, 3), -27);

        // Отрицательный показатель — ошибка
        System.out.println("\n=== Отрицательный показатель ===");
        int result1 = FirstTask.power(2, -1);
        System.out.println("power(2, -1) = " + result1 + " (должно быть 0 — ошибка)");

        int result2 = FirstTask.power(5, -3);
        System.out.println("power(5, -3) = " + result2 + " (должно быть 0 — ошибка)");
    }

    static void test(String name, int actual, int expected) {
        if (actual == expected) {
            System.out.println("✓ " + name);
        } else {
            System.out.println("✗ " + name + " (ожидается " + expected + ", получено " + actual + ")");
        }
    }
}