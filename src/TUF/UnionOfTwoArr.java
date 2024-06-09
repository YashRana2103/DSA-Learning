package TUF;

import java.util.ArrayList;

public class UnionOfTwoArr {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4};
        int[] arr2 = {2,3,4,4,5};

        System.out.println(unionArr(arr1, arr2));
    }

    private static ArrayList<Integer> unionArr(int[] arr1, int[] arr2) {
        int j = 0;
        int n = arr1.length;
        ArrayList<Integer> unionArray = new ArrayList<>();
        if(arr1.length > arr2.length) n = arr2.length;
        for (int i = 0; i < n - 1; i++) {
            if(arr1[i] != arr2[i]) {
                unionArray.add(j, arr1[i]);
                j++;
                unionArray.add(j, arr2[i]);
            }
            unionArray.add(j, arr1[i]);

        }
        return unionArray;
    }
}
