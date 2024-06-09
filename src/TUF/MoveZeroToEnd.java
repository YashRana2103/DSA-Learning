package TUF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4, 0, 0, 10, 1, 0, 1};

//        System.out.println(Arrays.toString(moveZeroToEnd_BruteForce(arr)));
        System.out.println(Arrays.toString(moveZeroToEnd_Optimal(arr)));
    }

    private static int[] moveZeroToEnd_BruteForce(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    private static int[] moveZeroToEnd_Optimal(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            while(arr[j] != 0) {
                j++;
            }

            while(arr[i] == 0) {
                i++;
            }

            if(i > j) {
                swap(arr, i, j);
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
