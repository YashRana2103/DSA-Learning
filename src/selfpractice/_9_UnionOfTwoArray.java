package selfpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class _9_UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 6};
        int[] arr2 = {1, 3, 6, 7, 9, 11, 15, 20};

        System.out.println(unionArray(arr1, arr1.length, arr2, arr2.length));
    }

    public static ArrayList<Integer> unionArray(int[] arr1, int n1, int[] arr2, int n2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while(i < n1 && j < n2) {
            if(arr1[i] <= arr2[j]) {
                if(list.isEmpty() || (list.getLast()) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if(list.isEmpty() || (list.getLast()) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(j < n2) {
            if(list.isEmpty() || (list.getLast()) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }
        while(i < n1) {
            if(list.isEmpty() || (list.getLast()) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }
        return list;
    }
}

