package com.alevel.lesson_002;

public class homework_02 {
    public static void main(String[] args) {

        double x1 = 1;
        double y1 = 5;
        double x2 = 3;
        double y2 = 5;
        double x3 = 6;
        double y3 = 7;

        System.out.println(triangleSq(x1, y1, x2, y2, x3, y3));

    }

    public static double triangleSq(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }
}
