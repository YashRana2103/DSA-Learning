package tuf;

import static java.lang.Math.min;

public class _28_BS_FindArrayRotation {
    public static void main(String[] args) {
        int[] arr1 = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        int[] arr2 = {9, 10, 11, 12, 13, 14, 15, 16, 17, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(findArrayRotation(arr1, arr1.length));
    }
    public static int findArrayRotation(int[] arr, int n) {
        int l = 0, h = n - 1;
        int ans = Integer.MAX_VALUE;
        int index = n - 1;
        while(l <= h) {
            int m = l + (h - l) / 2;
            if(arr[l] <= arr[h]) {
                if(arr[l] < ans) {
                    index = l;
                    ans = arr[l];
                }
                break;
            }
            if(arr[l] <= arr[m]) {
                if(arr[l] < ans) {
                    index = l;
                    ans = arr[l];
                }
                l = m + 1;
            } else {
                if(arr[m] < ans) {
                    index = m;
                    ans = arr[m];
                }
                h = m - 1;
            }
        }
        return index;
    }
}
