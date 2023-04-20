package com.bl;


import java.util.Scanner;

class Point {
    private int x;
    private int y;

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
    private Point startPoint;
    private Point endPoint;

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
    }
}