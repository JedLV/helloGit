package com.atmogul.java;

public class j205 {
    public static void main(String[] args) {
        int x =1 , y =2 ;
        int num1=5 , num2=5, num3 = 5 ,num4 =5;
        boolean r1,r2,r3,r4;

        r1 = x>y & num1 ++== 5;
        r2 = x>y && num2 ++== 5;
        r3 = x<y | num3 ++== 5;
        r4 = x<y || num4 ++== 5;

        System.out.println(r1 +"\t"+ num1);
        System.out.println(r2 +"\t"+ num2);
        System.out.println(r3 +"\t"+ num3);
        System.out.println(r4 +"\t"+ num4);
    }
}
