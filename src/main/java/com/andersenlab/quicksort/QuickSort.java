package com.andersenlab.quicksort;

public class QuickSort {

    private QuickSort() {
    }

    public static void sort(int[] array) {
        int from = 0;
        int to = array.length - 1;

        quickSort(array, from, to);
    }

    private static void quickSort(int[] arr, int from, int to) {
        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {

        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];

        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
