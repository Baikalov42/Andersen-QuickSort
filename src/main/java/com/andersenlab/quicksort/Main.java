package com.andersenlab.quicksort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3000);
        }

        System.out.println(Arrays.toString(arr));
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
