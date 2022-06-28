package ru.netology.maven.sqr;

public class SQRService {
    public int calcSqr(int d1, int d2) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= 200) & (i * i <= 300)) {
                x++;
                return x;
            }
        }
        return -1;
    }
}
