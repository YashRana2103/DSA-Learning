package selfpractice;

public class _22_BS_Floor_Ceil_InArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9, 11, 15, 20};
        System.out.println(floorInArray(arr, arr.length, 16));
        System.out.println(ceilInArray(arr, arr.length, 16));
    }
    public static int floorInArray(int[] arr, int n, int value) {
        int low = 0, high = n - 1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] <= value) {
                ans = arr[mid];
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }
    public static int ceilInArray(int[] arr, int n, int value) {
        int low = 0, high = n - 1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= value) {
                ans = arr[mid];
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }
}
