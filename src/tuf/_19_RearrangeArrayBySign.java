package tuf;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.min;

public class _19_RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr1 = {-1, 2, 3, -4, -6, 4, -8, 8, 9, -3};
        int[] arr2 = {-1, 2, -4, 3, 4, 9, 10};
        int[] arr3 = {-5, -9, -10, -11, 4, 5};

//        System.out.println(Arrays.toString(variety1(arr1, arr1.length)));
        System.out.println(Arrays.toString(variety2(arr3, arr3.length)));
    }

    private static int[] variety1(int[] arr, int n) {
//        return v1_RearrangeArray_BruteForce(arr, n);
        return v1_RearrangeArray_Optimal(arr, n);
    }

    private static int[] variety2(int[] arr, int n) {
        return v2_RearrangeArray_BruteForce(arr, n);
    }


    private static int[] v1_RearrangeArray_BruteForce(int[] arr, int n) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) positive.add(arr[i]);
            if(arr[i] < 0) negative.add(arr[i]);
        }
        for (int i = 0; i < (n/2); i++) {
            arr[2 * i] = positive.get(i);
            arr[(2 * i) + 1] = negative.get(i);
        }
        return arr;
    }

    private static int[] v1_RearrangeArray_Optimal(int[] arr, int n) {
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                ans[pos] = arr[i];
                pos+=2;
            }
            if(arr[i] < 0) {
                ans[neg] = arr[i];
                neg+=2;
            }
        }
        return ans;
    }

    private static int[] v2_RearrangeArray_BruteForce(int[] arr, int n) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) positive.add(arr[i]);
            if(arr[i] < 0) negative.add(arr[i]);
        }

        int minSize = min(positive.size(), negative.size());
        for (int i = 0; i < minSize; i++) {
            arr[2 * i] = positive.get(i);
            arr[(2 * i) + 1] = negative.get(i);
        }

        int index = minSize * 2;
        if(minSize == negative.size()) {
            for (int i = minSize; i < positive.size(); i++) {
                arr[index] = positive.get(i);
                index++;
            }
        } else {
            for (int i = minSize; i < negative.size(); i++) {
                arr[index] = negative.get(i);
                index++;
            }
        }
        return arr;
    }
}
