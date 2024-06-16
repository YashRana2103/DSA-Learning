package tuf;

import java.util.Arrays;

public class _4_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 45, 2, 4, 513, 14};

        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;

            for (int j = i; j < arr.length - 1; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }

        return arr;
    }

    static void swap(int[] arr, int val1, int val2) {
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }
}
