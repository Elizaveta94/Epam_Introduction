package com.practice.array;

public class ArrayTools {
    public static int[] extend(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int a3index = 0;
        for (int i = 0; i < a1.length; i++) {
            a3[a3index] = a1[i];
            a3index++;
        }
        for (int i = 0; i < a2.length; i++) {
            a3[a3index] = a2[i];
            a3index++;
        }
        return a3;
    }

    public static int[] extend(int[] a1, int elem) {
        int[] a2 = new int[a1.length + 1];
        for ( int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
        a2[a2.length - 1] = elem;
        return a2;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static int[] insert(int[] a1, int index, int elem) {
        int[] a2 = new int[a1.length + 1];
        for (int i = 0; i < a2.length; i++) {
            if (index > i) {
                a2[i] = a1[i];
            } else if (index == i)  {
                a2[i] = elem;
            } else {
                a2[i] = a1[i - 1];
            }
        }
        return a2;
    }

}
