package selfpractice;

import java.util.Arrays;

public class _3_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 45, 2, 4, 513, 14};

        System.out.println(Arrays.toString(sort(arr, arr.length)));
    }

    public static int[] sort(int[] arr, int n) {
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return arr;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
