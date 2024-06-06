package LeetCodes;

// https://leetcode.com/problems/find-the-duplicate-number/

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
//    int[] arr = {1, 5, 3, 4, 2, 7, 6, 9, 8};

        System.out.println(cyclicSortFindDuplicate(arr));
    }

    static int cyclicSortFindDuplicate(int[] arr) {

        //method 1
//        int i = 0;
//        while (i < arr.length){
//            int correct = arr[i] - 1;
//            if(i != correct && arr[i] == arr[correct]){
//                return arr[i];
//            }
//            if (arr[i] != arr[correct]){
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
//        }
//        return -1;

        //method 2
        int i = 0;
        while (i < arr.length){
            if(arr[i] != i + 1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
