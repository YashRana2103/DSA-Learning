package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 11, 13, 15, 20 };

        int target = 1;
        System.out.println(recursion_BinarySearch(arr, target, 0, arr.length - 1));
    }

    private static int recursion_BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int middle = start + ((end - start) / 2);

            if (target == arr[middle]) {
                return middle;
            }
            if (target > arr[middle]) {
                return recursion_BinarySearch(arr, target, middle + 1, end);
            }
            if (target < arr[middle]) {
                return recursion_BinarySearch(arr, target, start, end = middle - 1);
            }
        }
        return -1;
    }
}
