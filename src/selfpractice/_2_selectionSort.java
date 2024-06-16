package selfpractice;

import java.util.Arrays;

import static java.lang.Math.min;

public class _2_selectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 45, 2, 4, 513, 14};

        System.out.println(Arrays.toString(sort(arr, arr.length)));
    }

    public static int[] sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if(arr[min] > arr[j]) min = j;
            }
            swap(arr, i, min);
        }
        return arr;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
