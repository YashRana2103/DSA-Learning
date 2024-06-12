package TUF;

import java.util.ArrayList;

public class _20_LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};

        System.out.println(leaderInArray(arr, arr.length));
    }

    private static ArrayList<Integer> leaderInArray(int[] arr, int n) {
//        return BruteForce(arr, n);
        return Optimal(arr, n);
    }

    private static ArrayList<Integer> BruteForce(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if(leader) ans.add(arr[i]);
        }
        return ans;
    }

    private static ArrayList<Integer> Optimal(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n - 1];
        ans.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if(arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }
}
