package com.hebinet;

public class Prime {

    /**
     * Prints the nth prime number
     *
     * @param index
     */
    public static void printNth(int index) {
        int count = 1;
        int currentNumber = 1;

        if (index == 1) {
            currentNumber = 2;
        }

        while (count < index) {
            currentNumber += 2;

            if (isPrime(currentNumber)) {
                count++;
            }
        }

        System.out.println(index + ": " + currentNumber);
    }

    /**
     * Checks if the given number is a prime
     *
     * @param currentNumber
     *
     * @return
     */
    private static boolean isPrime(int currentNumber) {
        if (currentNumber == 2) {
            return true;
        }

        for (int i = 2; i < currentNumber; i++) {
            if (currentNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
