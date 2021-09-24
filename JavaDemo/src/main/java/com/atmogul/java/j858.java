package com.atmogul.java;

public class j858 {
    public static void main(String[] args) {
         String arr[] = new String[]{"AA,BB,CC,DD"};
        		for(int i = 0;i < arr.length / 2;i++){
			String temp = arr[i];
			arr[i] = arr[arr.length - i -1];
			arr[arr.length - i -1] = temp;
		}
    }
}
