package tuf;

import java.util.ArrayList;
import java.util.Arrays;

public class _7_MergeSort {
    public static void main(String[] args) {
        int[] arr = {32, 54, 12, 45, 12, 65, 321, 5, 2, 23, 1};

        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        if(low >= high){
            return arr;
        }
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        return merge(arr, low, mid, high);
    }

    public static int[] merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int leftArr = low;
        int rightArr = mid + 1;

        while(leftArr <= mid && rightArr<= high) {
            if(arr[leftArr] <= arr[rightArr]) {
                temp.add(arr[leftArr]);
                leftArr++;
            } else {
                temp.add(arr[rightArr]);
                rightArr++;
            }
        }

        while(leftArr <= mid) {
            temp.add(arr[leftArr]);
            leftArr++;
        }
        while(rightArr <= high) {
            temp.add(arr[rightArr]);
            rightArr++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return arr;
    }
}
