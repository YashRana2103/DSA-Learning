package selfpractice;

import java.util.Arrays;

public class _7_RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//        System.out.println(Arrays.toString(byOne(arr, arr.length)));
        System.out.println(Arrays.toString(byN(arr, arr.length, 3)));
    }

    public static int[] byOne(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++)
            arr[i - 1] = arr[i];
        arr[n - 1] = temp;
        return arr;
    }

    public static int[] byN(int[] arr, int n, int N) {
        N = N % n;
        for (int i = 0; i < N; i++) {
            int temp = arr[0];
            for (int j = 1; j < n; j++)
                arr[j - 1] = arr[j];
            arr[n - 1] = temp;
        }
        return arr;
    }
}
