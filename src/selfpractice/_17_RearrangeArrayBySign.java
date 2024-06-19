package selfpractice;

import java.util.Arrays;

public class _17_RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -4, -6, 4, -8, 8, 9, -3};
        System.out.println(Arrays.toString(version1_RearrangeArray(arr, arr.length)));
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
}
