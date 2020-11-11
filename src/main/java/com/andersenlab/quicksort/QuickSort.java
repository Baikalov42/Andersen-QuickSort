package com.andersenlab.quicksort;

public class QuickSort {

    public static void sort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        quickSort(array, start, end);
    }

    private static void quickSort(int[] arr, int start, int end) {

        if (start < end) {
            int index = partition(arr, start, end);

            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);

        for (int k = start; k < end; k++) {
            if (arr[k] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }
}
