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
        long largestProduct = 0;
        int[] largestDigits = new int[adjacentDigits];

        for (int i = 0; (i + adjacentDigits) < this.input.length; i++) {
            long currentProduct = 1;
            int[] currentDigits = new int[adjacentDigits];

            for (int j = i; j < (i + adjacentDigits); j++) {
                int currentDigit = Character.getNumericValue(this.input[j]);
                currentDigits[j - i] = currentDigit;

                if (j == i) {
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

        this.printDigits(largestDigits, largestProduct);
    }

    /**
     * Prints the digits with some boilerplate ;)
     *
     * @param digits
     * @param product
     */
    private void printDigits(int[] digits, long product) {
        System.out.println("Largest product:");

        String sep = "";
        for (int i = 0; i < digits.length; i++) {
            System.out.print(sep + digits[i]);
            sep = "x";
        }
        System.out.print(" = " + product);
    }
}
