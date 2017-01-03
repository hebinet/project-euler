package com.hebinet;


public class PrimeFactor {

    /**
     * Prints the largest prime factor of the given number
     *
     * @param number
     */
    public void printLargest(long number) {
        if (number < 2) {
            System.out.println("Please provide a number greater than 1");
            return;
        }

        int i;
        long originalNumber = number;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        System.out.println("Largest prime factor of " + originalNumber + " is " + i);
    }
}
