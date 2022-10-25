package com.training.arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;

        int[][] arr1 = new int[][]{new int[]{1, 2}, new int[]{3, 4}};

        int[][] arr2 = {{1, 2}, {3, 4}};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + ",");
            }
            System.out.println();
        }
    }
}
