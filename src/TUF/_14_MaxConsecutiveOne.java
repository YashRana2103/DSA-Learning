package TUF;

import static java.lang.Math.max;

public class _14_MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1};

        System.out.println(maxConsecutiveOne(arr));
    }

    private static int maxConsecutiveOne(int[] arr) {
        int count = 0;
        int max = count;
        for (int i = 0; i < arr.length; i++) {
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
