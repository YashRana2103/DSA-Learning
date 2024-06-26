package tuf;

public class _25_BS_SearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println(searchRotatedArray(arr, arr.length, 1));
    }
    public static int searchRotatedArray(int[] arr, int n, int target) {
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return mid;

            // check if left sorted
            if(arr[low] <= arr[mid]) {
                if(arr[low] <= target && target <= arr[mid]) high = mid - 1;
                else low = mid + 1;
            }
            //check if right sorted
            else {
                if(arr[mid] <= target && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
