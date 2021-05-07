package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (a > left.length - 1) {
                int x = right[b];
                rsl[i] = x;
                b++;
            } else if (b > right.length - 1) {
                int x = left[a];
                rsl[i] = x;
                a++;
            } else if (left[a] < right[b]) {
                int x = left[a];
                rsl[i] = x;
                a++;
            } else {
                int x = right[b];
                rsl[i] = x;
                b++;
            }
        }
        return rsl;
    }
}
