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

        /* Calculating the Line 1 Length UC-1 */

        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(Y2 - y1, 2));

        System.out.println("The Length of Line 1 Is: " + length1);

        System.out.print("Enter X1 Value: ");
        double a1 = ab.nextDouble();
        System.out.print("Enter Y1 Value: ");
        double b1 = ab.nextDouble();
        System.out.print("Enter X2 Value: ");
        double a2 = ab.nextDouble();
        System.out.print("Enter Y2 Value: ");
        double b2 = ab.nextDouble();

        /* Calculating the Line 2 Length UC-2 */

        double length2 = Math.sqrt((Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2)));

        System.out.println("The Length of Line 2 is: " + length2);




    }
}
