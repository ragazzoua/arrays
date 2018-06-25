package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int a1[] = {1, 2, 3};

        revers(a);
        revers(a1);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a1));
    }

    private static void revers(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;

        }
    }
}
