package com.epam.training.basics.branching;

public class Main {
    public static void main(String[] args) {
        task1(45, 90);
        System.out.println(task2(5, 6, 3, 9));
        System.out.println(task3(0, 0, 1, 1, 2, 2));
        System.out.println(task4(2, 3, 6, 8, 2));
        System.out.println(task5(2));
    }

    public static void task1(int a, int b) {
        if ((a + b) < 180) {
            System.out.println("triangle exist");
            if (a == 90 | b == 90 | (180 - a - b) == 90) {
                System.out.println("right triangle");
            }
        } else {
            System.out.println("triangle not exist");
        }

    }

    public static int task2(int a, int b, int c, int d) {
        int x, y;

        if (a > b) {
            x = b;
        } else {
            x = a;
        }

        if (c > d) {
            y = d;
        } else {
            y = c;
        }

        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static boolean task3(int x1, int y1, int x2, int y2, int x3, int y3) {
        return x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1;
    }

    public static boolean task4(int a, int b, int x, int y, int z) {
        if (a >= x & (b >= y || b >= z)) {
            return true;
        } else if (a >= y & (b >= x || b >= z)) {
            return true;
        } else if (a >= z & (b >= x || b >= y)) {
            return true;
        } else {
            return false;
        }
    }

    public static double task5(double x) {
        if (x <= 3) {
            return (x * x) - 3 * x + 9;
        } else {
            return 1 / (x * x * x - 6);
        }
    }
}
