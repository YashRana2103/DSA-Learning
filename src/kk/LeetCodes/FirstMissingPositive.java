package LeetCodes;

// https://leetcode.com/problems/first-missing-positive/

import java.util.ArrayList;
import java.util.List;

public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 0};
//        int[] arr = {3, 4, -1, 1};
        int[] arr = {7, 8, 9, 11, 12};

        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
