package com.bl;


import java.util.Scanner;

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class LengthCompare {
    private final Point startPoint;
    private final Point endPoint;

    public LengthCompare(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double length() {
        int xDiff = startPoint.getX() - endPoint.getX();
        int yDiff = startPoint.getY() - endPoint.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the start point: ");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();

        System.out.println("Enter the coordinates of the end point: ");
        int endX = scanner.nextInt();
        int endY = scanner.nextInt();

        Point startPoint = new Point(startX, startY);
        Point endPoint = new Point(endX, endY);

        LengthCompare line = new LengthCompare(startPoint, endPoint);
        System.out.println("The length of the line is " + line.length());

        LengthCompare line1 = new LengthCompare(startPoint, endPoint);
        LengthCompare line2 = new LengthCompare(startPoint, endPoint);

        double length1 = line1.length();
        double length2 = line2.length();

        System.out.println("Enter 1 to compare the lengths of the lines.");
        System.out.println("Enter 2 to check if the lines are equal in length.");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (length1 > length2) {
                    System.out.println("Line 1 is longer than Line 2.");
                } else if (length1 < length2) {
                    System.out.println("Line 2 is longer than Line 1.");
                } else {
                    System.out.println("Line 1 and Line 2 have the same length.");
                }
                break;
            case 2:
                if (line1.equals(line2)) {
                    System.out.println("Line 1 is equal in length to Line 2.");
                } else {
                    System.out.println("Line 1 is not equal in length to Line 2.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}