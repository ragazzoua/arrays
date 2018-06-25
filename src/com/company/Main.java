package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = {1,2,3,4,5,6};
        int b [] = new int [8];
        System.out.println(b);
        System.out.println(Arrays.toString(b));
        b[3]=100;
        System.out.println(Arrays.toString(b));
    }
}
