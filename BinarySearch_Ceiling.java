public class BinarySearch_Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 11, 13, 15, 20 };

        int target = 8;
        System.out.println(ceiling(arr, target));
    }

    // returns the smallest number greater than or equal to target
    // for eg, {8, 9, 15, 16, 20}, target = 15, returns 15 or 16(if 15 not exist)
    private static int ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest element in array
        // return -1;
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + ((end - start) / 2);

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else if (target == arr[middle]) {
                return middle;
            }
        }
        return arr[start];
    }
}
