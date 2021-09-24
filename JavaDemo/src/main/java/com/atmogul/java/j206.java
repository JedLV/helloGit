package com.atmogul.java;

public class j206 {
    public static void main(String[] args) {

        int a=12,b=-23,c=34;
        int max,min,t;

        /**
         * 最大值
         */
        t = a>b ? a : b;
        max = t > c ? t : c;

        /**
         * 最小值
         */
        t = a<b ?a : b;
        min = t < c ? t : c;

        /**
         * 显示结果
         */
        System.out.println(max);
        System.out.println(min);
    }
}
