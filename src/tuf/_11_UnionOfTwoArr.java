package tuf;

import java.util.ArrayList;

public class _11_UnionOfTwoArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 12, 13, 13, 14};
        int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1};

        System.out.println(unionArr(arr1, arr2));
    }

    private static ArrayList<Integer> unionArr(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> unionArray = new ArrayList<>();
        while(i < n1 && j < n2) {
            if(arr1[i] <= arr2[j]) {
                if (unionArray.size() == 0 || (unionArray.get(unionArray.size() - 1)) != arr1[i]) {
                    unionArray.add(arr1[i]);
                }
                i++;
            } else {
                if (unionArray.size() == 0 || (unionArray.get(unionArray.size() - 1)) != arr2[j]) {
                    unionArray.add(arr2[j]);
                }
                j++;
            }
        }

        while(j < n2) {
            if (unionArray.size() == 0 || (unionArray.get(unionArray.size() - 1)) != arr2[j]) {
                unionArray.add(arr2[j]);
            }
            j++;
        }

        while(i < n1) {
            if (unionArray.size() == 0 || (unionArray.get(unionArray.size() - 1)) != arr1[i]) {
                unionArray.add(arr1[i]);
            }
            i++;
        }

        return unionArray;
    }
}
