package com.company;

public class Main {

    public static void main(String[] args) {
	// Rectangle 5 x 8
        int a = 5;
        int b = 8;

        printRectangleInfo(5,8);

        //Rectangle 3 x 10

        printRectangleInfo(3, 10);

    }

    public static void printRectangleInfo(int a, int b) {

        int perimeter = 2 * a + 2 * b;
        int square = a * b;

        System.out.println("Rectangle " + a + " x " + b );
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Square is " + square);
        System.out.println("------------------------");
    }
}
