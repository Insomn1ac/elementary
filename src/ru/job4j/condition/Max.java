package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        boolean condition = a > b;
        return condition ? a : b;
    }
}
