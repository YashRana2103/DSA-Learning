package Sorting;

import java.util.Arrays;

public class CyclicSort {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 2, 7, 6, 5, 9, 8, 10};
//    int[] arr = {1, 5, 3, 4, 2, 7, 6, 9, 8};

    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void cyclicSort(int[] arr) {
    int i = 0;
    while (i < arr.length){
      int correct = arr[i] - 1;
      if (arr[i] != arr[correct]){
        swap(arr, i, correct);
      } else {
        i++;
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
