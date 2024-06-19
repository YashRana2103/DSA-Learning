package selfpractice;

import static java.lang.Math.max;

public class _16_MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 1, 3, -2, 4, -5, 6};
        System.out.println(kadaneAlgo(arr, arr.length));
        kadaneAlgo_printSubArr(arr, arr.length - 1);
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

    public static void kadaneAlgo_printSubArr(int[] arr, int n) {
        // not working
        int sum = 0;
        int max = arr[0];
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for(int i = 0; i < n; i++) {
            if(sum == 0) start = i;
            sum += arr[i];
            if(sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0) sum = 0;
        }

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
