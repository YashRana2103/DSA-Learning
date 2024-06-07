package TUF;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {32, 35, 1 , 75, 8, 90, 12, 34, 69};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <= n - 1; i++) {
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j - 1, j);
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
