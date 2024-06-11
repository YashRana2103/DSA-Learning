package TUF;

import static java.lang.Math.max;

public class MaxSubarrSum {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 1, 3, -2, 4, -5, 6};

        System.out.println(kadaneAlgo(arr));
    }

    private static int kadaneAlgo(int[] arr) {
        int sum = 0;
        int max = arr[0];

        for(int element: arr) {
            sum += element;
            max = max(sum, max);

            if(sum < 0) sum = 0;
        }

        return max;
    }
}
