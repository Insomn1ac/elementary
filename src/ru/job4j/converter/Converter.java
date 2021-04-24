package ru.job4j.converter;

public class Converter {

    public static int euro(int x) {
        return x / 70;
    }

    public static int dollar(int x) {
        return x / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.euro(140);
        int dollar = Converter.dollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");
    }
}
