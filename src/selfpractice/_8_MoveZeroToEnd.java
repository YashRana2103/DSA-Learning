package selfpractice;

import java.util.Arrays;

public class _8_MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 2, 3, 6, 5, 0, 9, 11, 8};

        System.out.println(Arrays.toString(moveZeroToEnd(arr, arr.length)));
    }

    public static int[] moveZeroToEnd(int[] arr, int n) {
        return bruteForce(arr, n);
//        return optimal(arr, n);
    }

    public static int[] bruteForce(int[] arr, int n) {
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) arr[i] = temp[i];
        return arr;
    }

    public static int[] optimal(int[] arr, int n) {
        return arr;
    }
}
