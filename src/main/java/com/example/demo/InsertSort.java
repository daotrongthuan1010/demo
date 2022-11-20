package com.example.demo;

import java.util.Arrays;

public class InsertSort {
    static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }
    public static void main(String[] args) {
        int a[] = new int[]{1,6,4,8,10,3,7,7};
        insertionSort(a);
        System.out.println(Arrays.toString(a));

    }

}
