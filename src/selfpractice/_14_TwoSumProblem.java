package selfpractice;

import java.util.Arrays;

import static java.lang.Math.max;

public class _14_TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 8, 4};
        System.out.println(Arrays.toString(twoSumProblem(arr, arr.length, 11)));
    }
    public static int[] twoSumProblem(int[] arr, int n, int target) {
        int[] hashArr = new int[target + 1];
        int[] ans = {-1, -1};
        Arrays.fill(hashArr, -1);
        for (int i = 0; i < n; i++) hashArr[arr[i]] = i;
        for (int i = 0; i < n; i++) {
            int secVal = target - arr[i];
            if(hashArr[secVal] != -1) {
                ans[0] = hashArr[secVal];
                ans[1] = i;
            }
        }
        return ans;
    }
}
