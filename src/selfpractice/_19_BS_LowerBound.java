package selfpractice;

public class _19_BS_LowerBound {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9, 11, 14, 17, 25};
        System.out.println(lowerBound(arr, arr.length, 13));
    }
    public static int lowerBound(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;
        int ans = n;
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
