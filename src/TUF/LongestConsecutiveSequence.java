package TUF;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.max;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 102, 100, 5, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 2};

        System.out.println(longestConsecutiveSequence(arr, arr.length));
    }

    private static int longestConsecutiveSequence(int[] arr, int n) {
//        return BruteForce(arr, n);
        return Optimal(arr, n);
    }

    private static int BruteForce(int[] arr, int n) {
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, n, x + 1)) {
                x = x + 1;
                count++;
            }
            longest = max(longest, count);
        }
        return longest;
    }

    private static int Optimal(int[] arr, int n) {
        mergeSort(arr, 0, n - 1);
        int longest = 0;
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] - 1 == lastSmaller) {
                count++;
                lastSmaller = arr[i];
            } else if(arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            longest = max(longest, count);
        }
        return longest;
    }

    private static boolean linearSearch(int[] arr, int n, int searchElement) {
        for (int i = 0; i < n; i++) {
            if(arr[i] == searchElement) return true;
        }
        return false;
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }

    private static int[] merge(int[] arr, int low, int mid, int high) {
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
