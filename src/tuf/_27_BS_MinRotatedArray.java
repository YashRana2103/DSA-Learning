package tuf;

import static java.lang.Math.min;

public class _27_BS_MinRotatedArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        System.out.println(minRotatedArray(arr, arr.length));
    }
    public static int minRotatedArray(int[] arr, int n) {
        int low = 0, high = n - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[high]) {
                ans = min(ans, arr[low]);
                break;
            }
            if(arr[low] <= arr[mid]) {
                ans = min(ans, arr[low]);
                low = mid + 1;
            } else {
                ans = min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}
