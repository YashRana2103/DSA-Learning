package tuf;

import java.util.Arrays;

public class _9_RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//        System.out.println(Arrays.toString(rotateLeft(arr)));
        System.out.println(Arrays.toString(rotateLeftNtimes(arr, 5)));
    }

    private static int[] rotateLeft(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i <= arr.length - 1; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
        return arr;
    }

    private static int[] rotateLeftNtimes(int[] arr, int n) {
        n = n % arr.length;

        if(n == arr.length) {
            return arr;
        }

        for (int i = 0; i < n; i++) {
            int temp = arr[0];

            for (int j = 1; j <= arr.length - 1; j++) {
                arr[j - 1] = arr[j];
            }

            arr[arr.length - 1] = temp;
        }
        return arr;
    }
}
