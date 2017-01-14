package com.hebinet;


public class Sum {

    /**
     * Holds all the different numbers
     */
    private String[] input;

    /**
     * Constructor
     *
     * @param content
     */
    public Sum(String content) {
        this.loadContent(content);
    }

    /**
     * Loads the given String in the String array
     *
     * @param content
     */
    private void loadContent(String content) {
        this.input = content.split("\n");
    }

    /**
     * Prints the Sum of the first n digits
     *
     * @param digits
     */
    public void printSumOfFirstNDigits(int digits) {
        // Works only with 11-100 numbers
        int length = digits + 2;
        Long sum = 0L;

        for (int i = 0; i < this.input.length; i++) {
            sum += Long.parseLong(this.input[i].substring(0, length));
        }

        System.out.println("First " + digits + " digits from the sum of all numbers are: " + sum.toString().substring(0, digits));
    }
}
