package ru.job4j.calculator;

public class Fit {

    public static double manWeight(int height) {

        return (height - 100) * 1.15;
    }

    public static double womanWeight(int height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(182);
        double woman = Fit.womanWeight(167);
        System.out.println("For man, 182 tall, ideal weight is " + man);
        System.out.println("For woman, 167 tall, ideal weight is " + woman);
    }
}
