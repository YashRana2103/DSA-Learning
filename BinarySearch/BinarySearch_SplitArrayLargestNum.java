package BinarySearch;

public class BinarySearch_SplitArrayLargestNum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};

        System.out.println(splitArray(arr, 2));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //Binary search
        while(start < end){
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this, in the range till max sum which is mid
            int sum = 0;
            int pieces = 1;

            for( int num : nums){
                if((sum + num) > mid){
                    // you can not add new element(value) to this array because if you add it then the size will be exceeded...
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
