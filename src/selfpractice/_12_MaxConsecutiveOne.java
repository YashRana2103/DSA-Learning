package selfpractice;

import static java.lang.Math.max;

public class _12_MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOne(arr, arr.length));
    }
    public static int findMaxConsecutiveOne(int[] arr, int n) {
        int count = 0;
        int max = count;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                count++;
                max = max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
