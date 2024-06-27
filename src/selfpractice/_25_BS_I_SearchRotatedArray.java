package selfpractice;

public class _25_BS_I_SearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(searchRotatedArray(arr, arr.length, 2));
    }
    public static int searchRotatedArray(int[] arr, int n, int target) {
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return mid;
            if(arr[low] <= arr[mid]) {
                if(arr[low] <= target && target <= arr[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if(arr[mid] <= target && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
