package com.atmogul.java;

public class Array1creat {
    public static void main(String[] args) {

        int num1[] = {1,2,3,4,5};
        int num2[];

        float ave = 0f;
        System.out.println();

        for (int i = 0; i < num1.length; i++)
            System.out.println(num1[i]);

        System.out.println(num1.length);

        num2 = num1;

        for (int j = 0; j < num2.length; j++) {
            System.out.println(num2[j]);
            ave = ave + num2[j];
        }

        ave = ave / num2.length;
        System.out.println(ave);
    }
}
