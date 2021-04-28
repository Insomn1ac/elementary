package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if ((x1 >= 0 && y1 >= 0) && (x1 <= 7 && y1 <= 7)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                result = Math.abs(x1 - x2);
                result = result > 0 ? result : 0;
            }
        }
        return result;
    }
}
