package com.atmogul.java;

public class j845 {
    public static void main(String[] args) {

        int[] arr4[] = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};

        for(int i = 0;i < arr4.length;i++){

            for(int j = 0;j < arr4[i].length;j++){
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
