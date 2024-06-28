package tuf;

public class _29_BS_SingleInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 6, 7, 7, 8, 8};
        System.out.println(single(arr, arr.length));
    }
    public static int single(int[] arr, int n) {
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n - 1] != arr[n - 2]) return arr[n - 1];
        int low = 1, high = n - 2;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) return arr[mid];
            if(
                    (mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                    (mid % 2 == 0 && arr[mid] == arr[mid + 1])
            ) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
