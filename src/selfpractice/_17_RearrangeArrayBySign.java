package selfpractice;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.min;

public class _17_RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr1 = {-1, 2, 3, -4, -6, 4, -8, 8, 9, -3};
        int[] arr2 = {-5, 9, 10, 11, 4, 5};
//        System.out.println(Arrays.toString(version1_RearrangeArray(arr1, arr1.length)));
        System.out.println(Arrays.toString(version2_RearrangeArray(arr2, arr2.length)));
    }
    public static int[] version1_RearrangeArray(int[] arr, int n) {
        int[] ans = new int[n];
        int pos = 0, neg = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else if(arr[i] < 0) {
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }
    public static int[] version2_RearrangeArray(int[] arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) pos.add(arr[i]);
            if(arr[i] < 0) neg.add(arr[i]);
        }
        int minSize = min(pos.size(), neg.size());
        for (int i = 0; i < minSize; i++) {
            arr[2 * i] = pos.get(i);
            arr[(2 * i) + 1] = neg.get(i);
        }
        int index = minSize * 2;
        if(minSize == neg.size()){
            for (int i = minSize; i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = minSize; i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }
        return arr;
    }
}
