package com.hebinet;

public class Pythagorean {

    /**
     * Prints the special Pythagorean triplet where a + b + c = maxSum
     *
     * @param maxSum
     */
    public static void printSpecialTriplet(int maxSum) {
        int a = 1;
        int b = 1;
        int c = 1;
        boolean found = false;

        for (a = 1; a < (maxSum - 1); a++) {
            for (b = a; b < (maxSum - 1); b++) {
                c = maxSum - a - b;
                if (c < 1) {
                    break;
                }

                if (a * a + b * b == c * c) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(a + "² + " + b + "² = " + c + "²");
                System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
                System.out.println(a + " x " + b + " x " + c + " = " + (a * b * c));

                break;
            }
        }


    }
}
