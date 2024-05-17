package BinarySearch;

// https://leetcode.com/problems/find-in-mountain-array/

public class BinarySearch_MountainSearch {
    public static void main(String[] args) {

        int[] arr = {1, 5, 9, 13, 17, 21, 20, 18, 14, 10, 6, 2};
        int target = 2;
        int result = mountainSearch(arr, target);
        if(result == -1){
            System.out.println("Target not found");
        }
        System.out.println(target+" found in array at index: arr["+result+"]");
    }

    private static int mountainSearch(int[] arr, int target){
        int peak = peekInMountainArray(arr);
        if(orderAgnosticBinarySearch(arr, target, 0, peak) != -1){
            return orderAgnosticBinarySearch(arr, target, 0, peak);
        }
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }

    private static int peekInMountainArray(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while(start != end){
            int mid = start + ((end - start) / 2);

            if(mountainArr[mid] <= mountainArr[mid+1]){
                start = mid + 1;
            } else if(mountainArr[mid] <= mountainArr[mid-1]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        // Order agnostic BS : when we don't know whether the array is sorted in which order.

        // find whether the array is sorted in Ascending or Descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int middle = start + ((end - start) / 2);

            if(arr[middle]==target){
                return middle;
            }

            //search element if the array is sorted in ascending order
            if(isAsc){
                if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else { //search element if the array is sorted in descending order
                if (target < arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}
