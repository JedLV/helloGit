package com.atmogul.java;

public class j850 {
    public static void main(String[] args) {
        int [] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};

        array2 = array1;
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0){
                array2[i] = i;
            }
        }
    }
}
