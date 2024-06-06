package LeetCodes;

//https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
    int[] arr = {1, 3, 4, 2, 6, 5, 0, 9, 8, 10};
//    int[] arr = {1, 5, 3, 4, 2, 7, 6, 0, 9, 8};
//        int[] arr = {1, 0, 2, 4};

        System.out.println(cyclicSortMissingNumber(arr));
//        System.out.println(Arrays.toString(arr));
    }

    static int cyclicSortMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }  else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
