package TUF;

import java.util.ArrayList;

public class _12_IntersectionOfTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 3, 5, 12, 13, 13, 14};
        int[] arr2 = {1, 1, 2, 3, 4, 5};

        System.out.println(intersectionOfTwoSortedArr(arr1, arr2));
    }

    private static ArrayList<Integer> intersectionOfTwoSortedArr(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> newArray = new ArrayList<>();
        while(i < n1 && j < n2) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr2[j] < arr1[i]) {
                j++;
            } else {
                newArray.add(arr1[i]);
                i++;
                j++;
            }
        }

        return newArray;
    }
}
