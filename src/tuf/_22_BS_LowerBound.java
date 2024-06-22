package tuf;

public class _22_BS_LowerBound {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 5, 7, 8, 9, 10, 11, 15, 21};
        System.out.println(lowerBound(arr, arr.length, 10));
        System.out.println(upperBound(arr, arr.length, 4));
        System.out.println(searchInsertPosition(arr, arr.length, 6));
    }
    public static int lowerBound(int[] arr, int n, int target) {
        int ans = n;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr, int n, int target) {
        int ans = n;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int searchInsertPosition(int[] arr, int n, int target) {
        // similar as Lower Bound
        int ans = n;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
