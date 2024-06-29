package selfpractice;

import static java.lang.Math.min;

public class _28_BS_FindArrayRotation {
    public static void main(String[] args) {
        int[] arr1 = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6};
        int[] arr2 = {9, 10, 11, 12, 13, 14, 15, 16, 17, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(findArrayRotation(arr1, arr1.length));
    }
    public static int findArrayRotation(int[] arr, int n) {
        int low = 0, high = n - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[low] <= arr[high]) {
                if(arr[low] < ans){
                    ans = arr[low];
                    index = low;
                }
                break;
            }
            if(arr[low] <= arr[mid]) {
                if(arr[low] < ans){
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                if(arr[mid] < ans){
                    ans = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
}
