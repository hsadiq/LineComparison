package com.bl;

import java.util.Scanner;

public class LineCompare {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Programme");

        Scanner ab = new Scanner(System.in);

        System.out.print("Enter X1 Value: ");
        double x1 = ab.nextDouble();
        System.out.print("Enter Y1 Value: ");
        double y1 = ab.nextDouble();
        System.out.print("Enter X2 Value: ");
        double x2 = ab.nextDouble();
        System.out.print("Enter Y2 Value: ");
        double Y2 = ab.nextDouble();

        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(Y2 - y1, 2));

        System.out.println("The Length of Line Is: " + length);

    }
}
