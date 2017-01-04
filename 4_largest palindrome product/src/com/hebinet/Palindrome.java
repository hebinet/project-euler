package com.hebinet;

public class Palindrome {

    /**
     * Finds the largest palindrome product
     */
    public static void calculate() {
        int max = 999;
        int min = 100;
        int largestPalindromeFound = 0;

        for (int i = max; i > min; i--) {
            if (i * i < largestPalindromeFound) {
                break;
            }

            for (int j = i; i * j > largestPalindromeFound; j--) {
                if (isPalindrome(i * j)) {
                    largestPalindromeFound = i * j;
                    System.out.println("Found " + largestPalindromeFound);
                    break;
                }
            }
        }

        System.out.println("Largest Palindrome: " + largestPalindromeFound);
    }

    /**
     * Checks if the given number is a palindrome
     *
     * @param number
     *
     * @return
     */
    private static boolean isPalindrome(int number) {
        String num = String.valueOf(number);
        char[] numChars = new char[num.length()];
        char[] reverseChars = new char[numChars.length];

        num.getChars(0, num.length(), numChars, 0);
        for (int i = 0; i < numChars.length; i++) {
            reverseChars[i] = numChars[(numChars.length - 1) - i];
        }

        return num.equals(String.valueOf(reverseChars));
    }

}
