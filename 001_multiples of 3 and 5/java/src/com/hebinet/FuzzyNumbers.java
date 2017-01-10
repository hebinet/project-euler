package com.hebinet;


import java.util.ArrayList;

public class FuzzyNumbers {

    private final int max;
    private ArrayList<Integer> numbers;

    /**
     * Constructor
     *
     * @param max
     */
    public FuzzyNumbers(int max) {
        this.max = max;
        this.numbers = new ArrayList<>();
    }

    /**
     * Calculate the fuzzy numbers
     */
    public void calculate() {
        for (int i = 1; i < this.max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numbers.add(i);
            }
        }
    }

    /**
     * Prints all numbers that can be divided by 3 or 5 and also prints the sum of the multiplies
     */
    public void printSum() {
        int sum = 0;
        for (Integer number : this.numbers) {
            sum += number;
            System.out.println(number);
        }
        System.out.println("----");
        System.out.println(sum);
    }
}
