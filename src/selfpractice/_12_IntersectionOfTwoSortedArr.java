package selfpractice;

import java.util.ArrayList;

public class _12_IntersectionOfTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 4, 6};

        System.out.println(intersectionOFTwoSortedArr(arr1, arr1.length, arr2, arr2.length));
    }
    public static ArrayList<Integer> intersectionOFTwoSortedArr(int[] arr1, int n1, int[] arr2, int n2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < n1 && j < n2) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr2[j] < arr1[i]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }
}
