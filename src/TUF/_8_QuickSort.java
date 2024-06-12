package TUF;

import java.util.Arrays;

public class _8_QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 6, 4};

        System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));
    }

    private static int[] sort(int[] arr, int low, int high) {
        if(low < high) {
            int pIndex = findPivotCorrectIndex(arr, low, high);

            sort(arr, low, pIndex - 1);
            sort(arr, pIndex + 1, high);
        }
        return arr;
    }

    private static int findPivotCorrectIndex(int[] arr, int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;

        while(i < j) {
            while((arr[i] <= arr[pivot]) && i <= high - 1) {
                i++;
            }
            while((arr[j] > arr[pivot]) && j >= low + 1) {
                j--;
            }

            if(i < j) swap(arr, i, j);
        }

        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int val1, int val2) {
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }
}
