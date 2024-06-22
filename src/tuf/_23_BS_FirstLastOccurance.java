package tuf;

import java.util.Arrays;

import static tuf._22_BS_LowerBound_UpperBound.*;

public class _23_BS_FirstLastOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 6, 6, 7};
//        System.out.println(Arrays.toString(firstLastOccurance_LB_UB(arr, arr.length, 2)));
        System.out.println(Arrays.toString(firstLastOccurance_BS(arr, arr.length, 3)));
    }
    public static int[] firstLastOccurance_LB_UB(int[] arr, int n, int value) {
        int lb = _22_BS_LowerBound_UpperBound.lowerBound(arr, n, value);
        if(lb == n || arr[lb] != value) return new int[]{-1, -1};
        return new int[]{lb, upperBound(arr, n, value) - 1};
    }
    public static int[] firstLastOccurance_BS(int[] arr, int n, int value) {
        int first = firstOccurance(arr, n, value);
        if(first == -1) return new int[]{-1, -1};
        return new int[]{first, lastOccurance(arr, n, value)};
    }
    public static int firstOccurance(int[] arr, int n, int value) {
        int ans = -1;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == value) {
                ans = mid;
                high = mid - 1;
            } else if(arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int[] arr, int n, int value) {
        int ans = -1;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] <= value) {
                ans = mid;
                low = mid + 1;
            } else if(arr[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
