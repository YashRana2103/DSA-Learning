package BinarySearch;

public class BinarySearch_RotatedArraySearch {
    public static void main(String[] args) {
        // int[] rotatedArr = {3, 4, 5, 6, 1, 2};
//        int[] rotatedArr = {8, 9, 10, 1, 2, 3, 4, 5, 6, 7};
        // int[] rotatedArr = {15, 16, 17, 18, 19, 20, 11, 12, 13, 14};
        // int[] rotatedArr = {25, 30, 35, 40, 5, 10, 15, 20};
        // int[] rotatedArr = {50, 55, 60, 1, 5, 10, 20, 25, 30, 40, 45};
        // int[] rotatedArr = {100, 110, 120, 130, 140, 150, 60, 70, 80, 90};
        // int[] rotatedArr = {12, 14, 16, 18, 20, 2, 4, 6, 8, 10};
        // int[] rotatedArr = {7, 8, 9, 10, 1, 2, 3, 4, 5, 6};
        // int[] rotatedArr = {23, 24, 25, 26, 27, 28, 29, 20, 21, 22};
//        int[] rotatedArr = {31, 32, 33, 34, 35, 36, 69, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] rotatedArr = {3,5,1};

        int target = 3;
        System.out.println(search(rotatedArr, target));
    }

    private static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + ((end - start) / 2);

            // case 1
            if(middle < end  && arr[middle] > arr[middle + 1]){
                return middle;
            }
            // case 2
            if(middle > start && arr[middle] < arr[middle - 1]){
                return middle-1;
            }
            // case 3
            if(arr[middle] <= arr[start]){
                end = middle - 1;
            } else { // case 4
                start = middle + 1;
            }
        }
        return -1;
    }

    private static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        System.out.println("Pivot: arr["+pivot+"]: "+arr[pivot]);

        // if pivot not found, if array is normal array
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }

        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        } else {
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
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
