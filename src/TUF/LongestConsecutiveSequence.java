package TUF;

import static java.lang.Math.max;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};

        System.out.println(longestConsecutiveSequence(arr, arr.length));
    }

    private static int longestConsecutiveSequence(int[] arr, int n) {
        return BruteForce(arr, n);
    }

    private static int BruteForce(int[] arr, int n) {
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, n, x + 1)) {
                x = x + 1;
                count++;
            }
            longest = max(longest, count);
        }
        return longest;
    }

    private static boolean linearSearch(int[] arr, int n, int searchElement) {
        for (int i = 0; i < n; i++) {
            if(arr[i] == searchElement) return true;
        }
        return false;
    }
}
