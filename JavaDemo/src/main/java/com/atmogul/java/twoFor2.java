package com.atmogul.java;

public class twoFor2 {
    public static void main(String[] args) {


        int arr [] = new  int []{3,2,4};
        int sum = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i +1; j++) {
                if (arr[i] + arr[j] ==sum){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}
