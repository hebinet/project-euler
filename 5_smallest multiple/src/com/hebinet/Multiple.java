package com.hebinet;

public class Multiple {

    /**
     * Prints the smallest Multiple which can be divided by each of the numbers from 1 to the max.
     *
     * @param max
     */
    public static void printSmallest(int max) {
        int currentNumber = 0;
        int i = 1;

        while (i < max) {
            currentNumber += 2;
            for (i = 2; i < max; i++) {
                if (i > currentNumber || currentNumber % i != 0) {
                    break;
                }
            }
        }

        System.out.println("Smallest Multiple: " + currentNumber);
    }
}
