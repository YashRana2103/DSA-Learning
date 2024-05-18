package LeetCodes;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class Minimum_In_RotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        return nums[(findPivotDuplicateValues(nums))+1];
    }

    private static int findPivotDuplicateValues(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 1){
            return -1;
        }

        while(start <= end){
            int middle = start + ((end - start) / 2);

            if(middle < end  && arr[middle] > arr[middle + 1]){
                return middle;
            }
            if(middle > start && arr[middle] < arr[middle - 1]){
                return middle-1;
            }

            // check for duplicate values
            // check if the start, end and middle are equal, if it is then ignore it
            if(arr[middle] == arr[start] && arr[middle] == arr[end]){
                // check if start pivot or not
                if(middle < end && arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                // check if end-1 is pivot or not
                if(middle > start && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            } else if(arr[middle] >= arr[start] || arr[middle] > arr[end]){
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
