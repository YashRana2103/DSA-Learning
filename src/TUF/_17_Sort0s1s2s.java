package TUF;

import java.util.Arrays;

public class _17_Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 2, 1, 0, 1, 2, 2, 0};

        System.out.println(Arrays.toString(dutchNationalFlagAlgo(arr, arr.length)));
    }

    private static int[] dutchNationalFlagAlgo(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if(arr[mid] == 1) {
                mid++;
            } else if(arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
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
