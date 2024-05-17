package BinarySearch;

public class BinarySearch_PeekIndex_In_Mountain_Array {
    public static void main(String[] args) {

        // mountain array = {1, 2, 3, 2, 1}
//        int[] mountainArr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
//        int[] mountainArr = {2, 4, 6, 8, 10, 9, 7, 5, 3, 1};
//        int[] mountainArr = {3, 6, 9, 12, 15, 14, 11, 8, 5, 2};
//        int[] mountainArr = {1, 3, 5, 7, 9, 11, 10, 8, 6, 4, 2};
//        int[] mountainArr = {5, 10, 15, 20, 25, 30, 28, 24, 18, 12, 6};
//        int[] mountainArr = {2, 3, 5, 7, 11, 13, 12, 9, 6, 4};
//        int[] mountainArr = {4, 8, 12, 16, 20, 18, 14, 10, 6, 2};
//        int[] mountainArr = {10, 20, 30, 40, 50, 45, 35, 25, 15, 5};
//        int[] mountainArr = {1, 5, 9, 13, 17, 21, 20, 18, 14, 10, 6, 2};
        int[] mountainArr = {3, 7, 11, 15, 19, 23, 22, 18, 13, 9, 5};

        System.out.println("Peek of the Mountain Array: mArr["+peekInMountainArray(mountainArr)+"] = "+mountainArr[peekInMountainArray(mountainArr)]);
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

//    public int peakIndexInMountainArray(int[] mountainArr) {
//        int start = 0;
//        int end = mountainArr.length - 1;
//
//        while(start < end){
//            int mid = start + ((end - start) / 2);
//
//            if(mountainArr[mid] <= mountainArr[mid+1]){
//                start = mid + 1;
//            } else{
//                end = mid ;
//            }
//        }
//        System.gc();
//        return start;
//    }
}
