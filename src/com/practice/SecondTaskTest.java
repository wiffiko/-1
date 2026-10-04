package com.practice;

public class SecondTaskTest {

    public static void main(String[] args) {
        System.out.println("=== Тесты SecondTask (population) ===\n");

        // Базовый случай рекурсии
        test("population(2, 3, 0) == 2", SecondTask.population(2, 3, 0), 2);
        test("population(7, 1, 0) == 7", SecondTask.population(7, 1, 0), 7);
        test("population(100, 5, 0) == 100", SecondTask.population(100, 5, 0), 100);

        // Рекурсивный случай (несколько кейсов)
        test("population(2, 3, 1) == 6", SecondTask.population(2, 3, 1), 6);
        test("population(2, 3, 2) == 18", SecondTask.population(2, 3, 2), 18);
        test("population(2, 3, 3) == 54", SecondTask.population(2, 3, 3), 54);
        test("population(7, 1, 1) == 7", SecondTask.population(7, 1, 1), 7);
        test("population(7, 1, 2) == 7", SecondTask.population(7, 1, 2), 7);
        test("population(7, 1, 3) == 7", SecondTask.population(7, 1, 3), 7);
        test("population(7, 1, 4) == 7", SecondTask.population(7, 1, 4), 7);
        test("population(5, 2, 1) == 10", SecondTask.population(5, 2, 1), 10);
        test("population(5, 2, 2) == 20", SecondTask.population(5, 2, 2), 20);
        test("population(5, 2, 3) == 40", SecondTask.population(5, 2, 3), 40);

        // ratio = 0, n > 0 → результат 0
        System.out.println("\n=== ratio = 0 ===");
        test("population(5, 0, 1) == 0", SecondTask.population(5, 0, 1), 0);
        test("population(5, 0, 2) == 0", SecondTask.population(5, 0, 2), 0);
        test("population(5, 0, 3) == 0", SecondTask.population(5, 0, 3), 0);
        test("population(100, 0, 5) == 0", SecondTask.population(100, 0, 5), 0);

        // ratio = 0, n = 0 → возвращается first
        test("population(5, 0, 0) == 5", SecondTask.population(5, 0, 0), 5);
    }

    static void test(String name, int actual, int expected) {
        if (actual == expected) {
            System.out.println("✓ " + name);
        } else {
            System.out.println("✗ " + name + " (ожидается " + expected + ", получено " + actual + ")");
        }
    }
}