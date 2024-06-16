package tuf;

import java.util.Arrays;

public class _16_TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {6, 4};
        int target = 10;

        System.out.println(Arrays.toString(check2Sum_Index(arr, arr.length, target)));
        System.out.println(check2Sum_Bool(arr, arr.length, target));
    }

    private static int[] check2Sum_Index(int[] arr, int n, int target) {
        int[] hashArray = new int[target+1];
        int[] ans = new int[2];
        Arrays.fill(hashArray, -1);
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            hashArray[arr[i]] = i;
        }

        for (int i = 0; i < n; i++) {
            if(hashArray[target - arr[i]] != -1) {
                ans[0] = i;
                ans[1] = hashArray[target - arr[i]];
            }
        }

        return ans;
    }

    private static boolean check2Sum_Bool(int[] arr, int n, int target) {
        int[] hashArray = new int[target+1];
        int[] ans = new int[2];
        Arrays.fill(hashArray, -1);
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            hashArray[arr[i]] = i;
        }

        for (int i = 0; i < n; i++) {
            if(hashArray[target - arr[i]] != -1) {
                return true;
            }
        }

        return false;
    }
}
