package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double d = x2 - x1;
        double e = y2 - y1;
        double a = Math.pow(d, 2);
        double b = Math.pow(e, 2);
        return Math.sqrt(a + b);
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 8, 4, 8);
        System.out.println("result (2, 8) to (4, 8) is " + result);
    }
}
