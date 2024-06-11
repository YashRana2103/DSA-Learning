package TUF;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};

        System.out.println(Arrays.toString(check2Sum(arr, arr.length, 14)));
    }

    private static int[] check2Sum(int[] arr, int n, int target) {
        int[] hashArray = new int[target+1];
        int[] ans = new int[2];
        Arrays.fill(hashArray, -1);
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            hashArray[arr[i]] = i;
        }

        for (int i = 0; i < n; i++) {
            int secVal = target - arr[i];

            if(hashArray[secVal] != -1) {
                ans[0] = i;
                ans[1] = hashArray[secVal];
            }
        }

        return ans;
    }
}
