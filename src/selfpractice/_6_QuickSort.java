package selfpractice;

import java.util.Arrays;

public class _6_QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 12, 25, 4, 5, 16, 8};

        System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));
    }

    public static int[] sort(int[] arr, int low, int high) {
        if(low < high) {
            int pivotIndex = findPivotIndex(arr, low, high);

            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
        return arr;
    }

    static int findPivotIndex(int[] arr, int low, int high) {
        int pivotIndex = low;
        int i = low;
        int j = high;

        while(i < j) {
            while((arr[i] <= arr[pivotIndex]) && i <= high - 1) i++;
            while((arr[j] > arr[pivotIndex]) && j >= low + 1) j--;

            if(i < j) swap(arr, i, j);
        }
        swap(arr, pivotIndex, j);
        return j;
    }

    static void swap(int[] arr, int val1, int val2) {
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }
}
