package selfpractice;

public class _26_BS_II_SearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 4, 4, 5, 1, 2, 3, 3, 3};
        System.out.println(searchRotatedArray(arr, arr.length, 9));
    }
    public static boolean searchRotatedArray(int[] arr, int n, int target) {
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return true;
            if(arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            if(arr[low] <= arr[mid]) {
                if(arr[low] <= target && target <= arr[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if(arr[mid] <= target && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }
}
