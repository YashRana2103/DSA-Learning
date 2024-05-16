public class BinarySearch_OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = { 90, 68, 45, 30, 17, 8, 3, 0, -5, -11, -34, -40 };
        // int[] arr = { 2, 4, 5, 6, 7, 11, 13, 15, 20 };

        int target = -5;
        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {
//        Order angostic BS : when we don't whether the array is sorted in which order.

        int start = 0;
        int end = arr.length - 1;

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
