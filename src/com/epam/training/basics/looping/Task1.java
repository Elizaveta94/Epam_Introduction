package com.epam.training.basics.looping;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        int i = 1;
        int summ = 0;
        while (i <= n) {
            summ += i;
            i++;
        }
        System.out.println(summ);


    }
}
