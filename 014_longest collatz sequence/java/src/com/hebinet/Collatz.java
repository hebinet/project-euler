package com.hebinet;

public class Collatz {

    /**
     * Prints the starting number of the longest chain
     *
     * @param limit
     */
    public static void printStartingNumberWithLongestChainUnder(long limit) {
        int longestChain = 0;
        long longestStartingNumber = 0;

        for (long i = limit; i > 0; i--) {
            int currentChain = getChainCount(i);
            if (currentChain > longestChain) {
                longestChain = currentChain;
                longestStartingNumber = i;
            }
        }

        System.out.println("Starting number with the longest chain is " + longestStartingNumber + " with " + longestChain + " parts.");
    }

    /**
     * Returns the chain count of the given number
     *
     * @param currentNumber
     *
     * @return
     */
    private static int getChainCount(long currentNumber) {
        int count = 1;

        while (currentNumber > 1) {
            if (currentNumber % 2 == 0) {
                currentNumber /= 2;
            } else {
                currentNumber = 3 * currentNumber + 1;
            }
            count++;
        }

        return count;
    }
}
