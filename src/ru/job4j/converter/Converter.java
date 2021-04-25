package ru.job4j.converter;

public class Converter {

    public static int euro(int x) {
        return x / 70;
    }

    public static int dollar(int x) {
        return x / 60;
    }

    public static void main(String[] args) {
        int inEuro = 140;
        int expectEuro = 2;
        int outE = Converter.euro(inEuro);
        boolean passE = expectEuro == outE;
        int inDollar = 180;
        int expectDollar = 3;
        int outD = Converter.dollar(inDollar);
        boolean passD = expectDollar == outD;
        System.out.println("140 rubles are 2 euro. Test result: " + passE);
        System.out.println("180 rubles are 3 dollars. Test result: " + passD);
    }
}
