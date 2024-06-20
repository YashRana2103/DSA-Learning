package selfpractice;

import java.util.ArrayList;

public class _18_LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {45, 1, 21, 43, 2, 12};
        System.out.println(leaderInArray(arr, arr.length));
    }
    public static ArrayList<Integer> leaderInArray(int[] arr, int n) {
        ArrayList<Integer> li = new ArrayList<>();
        int max = arr[n - 1];
        li.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if(arr[i] > max) {
                li.add(arr[i]);
                max = arr[i];
            }
        }
        return li;
    }
}
