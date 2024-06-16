package tuf;

import static java.lang.Math.max;

public class _21_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 102, 100, 5, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 2};

        System.out.println(longestConsecutiveSequence(arr, arr.length));
    }

    private static int longestConsecutiveSequence(int[] arr, int n) {
//        return BruteForce(arr, n);
        return Better(arr, n);
//        return Optimal(arr, n);
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

    private static int Better(int[] arr, int n) {
        _7_MergeSort.mergeSort(arr, 0, n - 1);
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
}
