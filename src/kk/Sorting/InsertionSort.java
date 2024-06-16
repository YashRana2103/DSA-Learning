package Sorting;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    // int[] arr = {9, 2, 0, 1, -2, -89, 3, 30, 69};
    // int[] arr = {5, -10, 12, 0, 7, 45, -23, 88, -5};
    // int[] arr = {22, 15, -1, 8, 99, 3, -50, 13, 77};
    int[] arr = { 34, -6, 27, 10, -90, 17, 0, 5, 31 };
    // int[] arr = {4, 18, -12, 67, 29, -38, 42, 56, -8};
    // int[] arr = {19, -4, 11, 33, -47, 25, 8, 59, 0};
    // int[] arr = { 2, 16, -22, 49, -7, 13, 21, 30, 37 };
    // int[] arr = {28, -14, 9, 5, 73, -1, 41, 22, -19};
    // int[] arr = { 13, 6, -8, 24, 35, -15, 48, 9, -3 };
    // int[] arr = { 7, 20, -25, 31, -5, 11, 38, 42, -2 };

    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
