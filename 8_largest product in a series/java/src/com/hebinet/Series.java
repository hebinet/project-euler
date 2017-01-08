package com.hebinet;

public class Series {

    private char[] input;

    /**
     * Constructor
     *
     * @param input
     */
    public Series(String input) {
        this.input = input.toCharArray();
    }

    /**
     * Prints the largest product
     *
     * @param adjacentDigits
     */
    public void printlargestProduct(int adjacentDigits) {
        int largestProduct = 0;
        int[] largestDigits = new int[adjacentDigits];

        for (int i = 0; (i + adjacentDigits) < this.input.length; i++) {
            int currentProduct = 0;
            int[] currentDigits = new int[adjacentDigits];

            for (int j = i; j < (i + adjacentDigits); j++) {
                int currentDigit = Character.getNumericValue(this.input[j]);
                currentDigits[j - i] = currentDigit;

                if (currentProduct == 0) {
                    currentProduct = currentDigit;
                } else {
                    currentProduct *= currentDigit;
                }
            }

            if (currentProduct > largestProduct) {
                largestProduct = currentProduct;
                largestDigits = currentDigits;
            }
        }

        String sep = "";
        for (int i = 0; i < largestDigits.length; i++) {
            System.out.print(sep + largestDigits[i]);
            sep = " x ";
        }
        System.out.print(" = " + largestProduct);
    }
}
