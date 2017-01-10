package com.hebinet;


public class SquareDifference {

    /**
     * Prints the sum
     *
     * @param max
     */
    public static void printSum(int max) {
        int sumSquares = 0;
        int sumNumbers = 0;
        int sumNumbersSquare;

        for (int i = 1; i <= max; i++) {
            sumSquares += i * i;
            sumNumbers += i;
        }

        sumNumbersSquare = sumNumbers * sumNumbers;

        System.out.println(sumNumbersSquare + "-" + sumSquares + "=" + (sumNumbersSquare - sumSquares));
    }
}
