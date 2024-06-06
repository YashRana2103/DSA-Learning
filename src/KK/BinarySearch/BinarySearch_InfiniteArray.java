package BinarySearch;

// in this problem we don't know the size of the array.
// size of the array is infinite.
// here we don't have to use arr.length property.

public class BinarySearch_InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 11, 15, 16, 19, 20, 21, 25, 28, 30, 31};

        System.out.println(ans(arr, 21));
    }

    private static int ans(int[] arr, int target){
        // first find the range
        // start box with size 2
        int start = 0;
        int end = 1;

        while( target > arr[end] ){

            int newStart = end + 1;

            // create the new chunk with double size
            // end = previous end + (sizeofbox) * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int middle = start + ((end - start) / 2);

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
