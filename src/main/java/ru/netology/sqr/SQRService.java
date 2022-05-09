package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int leftBorder, int rightBorder) {
        int counter = 0;

        for (int i = 10; i < 100; i++) {
            if ((i * i) >= leftBorder && (i * i) <= rightBorder) {
                counter = counter + 1;
            }
        }

        return counter;
    }
}

