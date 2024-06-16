package selfpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class _5_MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 12, 25, 4, 5, 16, 8};

        System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));
    }

    public static int[] sort(int[] arr, int low, int high) {
        if(low >= high) return arr;

        int mid = (low + high) / 2;

        sort(arr, low, mid);
        sort(arr, mid + 1, high);

        return merge(arr, low, mid, high);
    }

    public static int[] merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> tempList = new ArrayList<>();

        int leftArrPointer = low;
        int rightArrPointer = mid + 1;

        while(leftArrPointer <= mid && rightArrPointer <= high) {
            if(arr[leftArrPointer] <= arr[rightArrPointer]) {
                tempList.add(arr[leftArrPointer]);
                leftArrPointer++;
            } else {
                tempList.add(arr[rightArrPointer]);
                rightArrPointer++;
            }
        }

        while(leftArrPointer <= mid) {
            tempList.add(arr[leftArrPointer]);
            leftArrPointer++;
        }
        while(rightArrPointer <= high) {
            tempList.add(arr[rightArrPointer]);
            rightArrPointer++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = tempList.get(i - low);
        }

        return arr;
    }
}
