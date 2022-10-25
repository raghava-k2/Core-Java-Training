package com.training.arrays;

public class SingleDimensionArray {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 2;
        arr[2] = 4;
        System.out.println(arr.length);

        int[] arr1 = new int[]{1, 2, 3, 45};
        int[] arr2 = {1, 2, 3, 4, 5};
        String[] arr3 = {"asd", "asda"};
        System.out.println(arr1.length + "::" + arr2.length + "::" + arr3.length);
    }
}
