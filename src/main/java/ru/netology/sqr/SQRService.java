package ru.netology.sqr;

public class SQRService {

    public static int count(int bottomBound, int upperBound) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (Math.pow(i, 2) >= bottomBound)
                if (Math.pow(i, 2) <= upperBound)
                    count++;
        }
        return count;
    }
}




