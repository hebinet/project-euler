package com.hebinet;

import java.util.ArrayList;

public class Prime {

    /**
     * Prints the sum of all primes within upperLimit
     *
     * @param upperLimit
     */
    public static void printSum(int upperLimit) {
        long sum = 0;
        int[] primes = getPrimesUntil(upperLimit);
        for (int i = 0; i < primes.length; i++) {
            sum += primes[i];
        }

        System.out.println("Sum of all primes below " + upperLimit + ": " + sum);
    }

    /**
     * Return all primes within upperLimit
     *
     * @param upperLimit
     *
     * @return
     */
    private static int[] getPrimesUntil(int upperLimit) {
        ArrayList<Integer> primes = new ArrayList<>();

        // Implement the Sieve of Eratosthenes
        boolean[] sieve = new boolean[upperLimit];
        for (int i = 0; i < sieve.length; i++) {
            sieve[i] = false;
        }
        sieve[0] = true;
        sieve[1] = true;

        for (int i = 2; i < Math.sqrt(upperLimit); i++) {
            if (!sieve[i]) {
                primes.add(i);

                for (int j = i * i; j < upperLimit; j += i) {
                    sieve[j] = true;
                }
            }
        }

        for (int i = (int) Math.sqrt(upperLimit) + 1; i < upperLimit; i++) {
            if (!sieve[i]) {
                primes.add(i);
            }
        }

        // Convert ArrayList to int array
        int[] output = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            output[i] = primes.get(i);
        }

        return output;
    }
}
