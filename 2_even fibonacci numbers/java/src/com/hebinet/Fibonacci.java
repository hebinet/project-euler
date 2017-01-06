package com.hebinet;

public class Fibonacci {

    /**
     * Calculates the even fibonacci numbers and prints the total sum of them.
     */
    public void calculateEvenSum() {
        long lastNumber = 1;
        long totalSum = 0;
        long tempNumber;

        for (long i = 1; i < 4000000; ) {
            System.out.println(i);
            if (i % 2 == 0) {
                totalSum += i;
            }
            tempNumber = i;
            i += lastNumber;
            lastNumber = tempNumber;
        }

        System.out.println(totalSum);
    }
}
