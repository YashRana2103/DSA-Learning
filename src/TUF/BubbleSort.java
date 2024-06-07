package TUF;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {32, 35, 1 , 75, 8, 90, 12, 34, 69};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n-1; i >= 1 ; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
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
