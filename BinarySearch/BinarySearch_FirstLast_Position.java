import java.util.Arrays;

public class BinarySearch_FirstLast_Position {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 4, 4, 4, 4, 6, 9, 9, 9, 9, 9 };

        int target = 9;
        System.out.println(Arrays.toString(firstLastPosition(arr, target)));
    }

    private static int[] firstLastPosition(int[] arr, int target) {
        int[] ans = {-1, -1};

        //Check for first occurrence of target
        ans[0] = binarySearch(arr, target, true);

        //Check for last occurrence of target
        ans[1] = binarySearch(arr, target, false);

        return ans;
    }

    static int binarySearch(int[]arr, int target, boolean isSearchStartIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                // potential answer found

                //search for first occurrence
                if(isSearchStartIndex){
                    ans = mid;
                    end = mid - 1;
                }

                //search for last occurrence
                else {
                    ans = mid;
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
