package selfpractice;

import java.util.Arrays;

public class _15_Sort_0_1_2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 2, 1, 2, 2, 0, 2};
        System.out.println(Arrays.toString(dutchNationalFlagAlgo(arr, arr.length)));
    }
    public static int[] dutchNationalFlagAlgo(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, low, mid);
                mid++;
                low++;
            } else if(arr[mid] == 1) {
                mid++;
            } else if(arr[mid] == 2) {
                swap(arr, high, mid);
                high--;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
