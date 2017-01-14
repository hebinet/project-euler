package com.hebinet;

public class TriangleNumbers {

    /**
     * Prints the first triangle number with more than n divisors
     *
     * @param divisors
     */
    public static void printFirstNumberWithNDivisors(int divisors) {
        int currentNumber = 0;
        int i = 1;
        int currentDivisors = 0;

        while (currentDivisors < divisors) {
            currentNumber += i;
            i++;
            currentDivisors = getNumberOfDivisors(currentNumber);

            System.out.print("\rCurrent number " + currentNumber + " has " + currentDivisors);
        }

        System.out.println("\nFirst triangle number with over " + divisors + " is " + currentNumber);
    }

    /**
     * Returns the number of divisors of a given number
     *
     * @param currentNumber
     *
     * @return
     */
    private static int getNumberOfDivisors(int currentNumber) {
        int divisors = 0;
        int sqrt = (int) Math.sqrt(currentNumber);

        for (int i = 1; i <= sqrt; i++) {
            if (currentNumber % i == 0) {
                divisors += 2;
            }
        }

        if (sqrt * sqrt == currentNumber) {
            divisors--;
        }

        return divisors;
    }
}
