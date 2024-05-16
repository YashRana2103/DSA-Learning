public class BinarySearch_Floor {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 11, 13, 15, 20 };

        int target = 1;
        System.out.println(floor(arr, target));
    }

    // returns the greatest number smaller than or equal to target
    // for eg, {8, 9, 15, 16, 20}, target = 15, returns 15 or 9(if 15 not exist)
    private static int floor(int[] arr, int target) {
        // but what if the target is smaller than the smallest element in array // it returns -1 // no need to code

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
        return end;
    }
}
