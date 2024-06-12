package TUF;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -4, -6, 4, -8, 8, 9, -3};

        System.out.println(Arrays.toString(variety1(arr, arr.length)));
    }

    private static int[] variety1(int[] arr, int n) {
//        return rearrangeArray_BruteForce(arr, n);
        return rearrangeArray_Optimal(arr, n);
    }

    private static int[] rearrangeArray_BruteForce(int[] arr, int n) {
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

    private static int[] rearrangeArray_Optimal(int[] arr, int n) {
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
}
