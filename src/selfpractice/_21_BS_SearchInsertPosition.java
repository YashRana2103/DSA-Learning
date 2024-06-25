package selfpractice;

public class _21_BS_SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 11, 17, 20};
        System.out.println(searchInsertPosition(arr, arr.length, 13));
    }
    public static int searchInsertPosition(int[] arr, int n, int value) {
        int low = 0, high = n - 1;
        int ans = n;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= value) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }
}
