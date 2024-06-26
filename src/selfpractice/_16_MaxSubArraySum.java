package selfpractice;

import static java.lang.Math.max;

public class _16_MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 1, 3, -2, 4, -5, 6};
        System.out.println(kadaneAlgo(arr, arr.length));
    }
    public static int kadaneAlgo(int[] arr, int n) {
        int sum = 0;
        int max = arr[0];
        for(int ele: arr) {
            sum += ele;
            max = max(sum, max);
            if(sum < 0) sum = 0;
        }
        if(max < 0) return 0;
        return max;
    }
}
