package BinarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 11, 13, 15, 20 };

        int target = 5;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
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
        return -1;
    }
}
