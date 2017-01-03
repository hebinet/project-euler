package com.hebinet;

public class Main {

    public static void main(String[] args) {
	    if (args.length > 0) {
            FuzzyNumbers numbers = new FuzzyNumbers(Integer.parseInt(args[0]));
            numbers.calculate();
            numbers.printSum();
        } else {
            System.out.println("Not enough arguments");
        }
    }
}
