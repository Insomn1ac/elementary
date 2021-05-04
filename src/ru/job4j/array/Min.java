package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int minValue = array[0];
        for (int i : array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }
}
