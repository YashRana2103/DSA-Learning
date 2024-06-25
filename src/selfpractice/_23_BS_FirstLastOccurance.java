package selfpractice;
import tuf._22_BS_LowerBound_UpperBound;

import java.util.Arrays;

import static tuf._22_BS_LowerBound_UpperBound.*;

public class _23_BS_FirstLastOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 7, 7, 7, 9, 10};
//        System.out.println(Arrays.toString(firstLastOccurance_LB_UB(arr, arr.length, 7)));
        System.out.println(Arrays.toString(firstLastOccurance_BS(arr, arr.length, 7)));
    }
    public static int[] firstLastOccurance_LB_UB(int[] arr, int n, int value) {
        int lb = _22_BS_LowerBound_UpperBound.lowerBound(arr, n, value);
        if(lb == n || arr[lb] != value) return new int[]{-1, -1};
        return new int[] {lb, _22_BS_LowerBound_UpperBound.upperBound(arr, n, value) - 1};
    }
    public static int[] firstLastOccurance_BS(int[] arr, int n, int value) {
        int firstOcc = firstOccurance(arr, n, value);
        if(firstOcc == -1) return new int[]{-1, -1};
        return new int[] {firstOcc, lastOccurance(arr, n, value)};
    }
    public static int firstOccurance(int[] arr, int n, int value) {
        int low = 0, high = n -1;
        int ans = -1;
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
        int low = 0, high = n - 1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == value) {
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
