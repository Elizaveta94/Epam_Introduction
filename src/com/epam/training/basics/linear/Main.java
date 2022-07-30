package com.epam.training.basics.linear;

public class Main {
    public static void main(String[] args) {
        System.out.println(task1(4, 5, 1));
        System.out.println(task2(2, 6, 4));
        System.out.println(task3(1, 1));
        System.out.println(task4(777.333));
        task5(12615);
        System.out.println(task6(2, -3));
        System.out.println(task6(3, 1));
    }

    public static double task1(int a, int b, int c) {
        double z = ((a - 3) * b / 2.0) + c;
        return z;
    }

    public static double task2(int a, int b, int c) {
        return ((b + Math.sqrt((b * b) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static double task3(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }

    public static double task4(double r) {
        long a = (long) r;
        long b = Math.round((r % a) * 1000);
        return (a / 1000.0) + b;
    }

    public static void task5(long t) {
        long h = t / 3600;
        long m = t / 60 - h * 60;
        long s = t - m * 60 - h * 3600;
        System.out.println(h + "h " + m + "min " + s + "sec");
    }

    public static boolean task6(int x, int y) {
        return (x >= -4 & x <= 4 & y >= -3 & y <= 0) | (x >= -2 & x <= 2 & y >= 0 & y <= 4);
    }
}

