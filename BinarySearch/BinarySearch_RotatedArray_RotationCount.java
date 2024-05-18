package BinarySearch;

public class BinarySearch_RotatedArray_RotationCount {
    public static void main(String[] args) {
        // int[] rotatedArr = {3, 3, 4, 5, 5, 6, 1, 1, 2, 2};
        // int[] rotatedArr = {8, 9, 9, 10, 1, 1, 2, 3, 4, 4, 5, 6, 7, 7};
        // int[] rotatedArr = {15, 15, 16, 17, 17, 18, 19, 19, 20, 11, 11, 12, 13, 13, 14, 14};
        // int[] rotatedArr = {25, 25, 30, 30, 35, 40, 5, 5, 10, 15, 20, 20};
        // int[] rotatedArr = {50, 50, 55, 60, 1, 1, 5, 10, 20, 25, 30, 30, 40, 45, 45};
        // int[] rotatedArr = {100, 110, 120, 130, 130, 140, 150, 60, 60, 70, 80, 90, 90};
        // int[] rotatedArr = {12, 12, 14, 16, 18, 20, 2, 2, 4, 6, 8, 8, 10, 10};
        // int[] rotatedArr = {7, 8, 9, 9, 10, 1, 1, 2, 3, 4, 5, 5, 6, 6};
        // int[] rotatedArr = {23, 23, 24, 25, 26, 27, 28, 29, 20, 20, 21, 22, 22};
         int[] rotatedArr = {36, 36, 36, 36, 36, 36, 36, 36, 21, 22, 23, 24, 25, 26, 27, 28, 29, 36};
//        int[] rotatedArr = {1};

        System.out.println("Rotation count: "+rotationCount(rotatedArr));
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

    private static int rotationCount(int[] arr){
//        int start = 0;
//        int pivot = findPivotDuplicateValues(arr);x

//         return ((pivot - start) + 1);
        return (findPivotDuplicateValues(arr) + 1);
    }
}
