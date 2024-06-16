package selfpractice;

import java.util.Arrays;

public class _4_InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };

        System.out.println(Arrays.toString(sort(arr, arr.length)));
    }

//    public static int[] sort(int[] arr, int n) {
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                if(arr[j] > arr[i]) swap(arr, j, i);
//            }
//        }
//        return arr;
//    }

    public static int[] sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while(j > 0) {
                if(arr[j - 1] > arr[j]) swap(arr, j-1, j);
                j--;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int val1, int val2) {
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }
}
