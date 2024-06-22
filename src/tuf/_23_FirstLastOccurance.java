package tuf;

import java.util.Arrays;

import static tuf._22_BS_LowerBound_UpperBound.*;

public class _23_FirstLastOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 6, 6, 7};
        System.out.println(Arrays.toString(firstLastOccurance(arr, arr.length, 2)));
    }
    public static int[] firstLastOccurance(int[] arr, int n, int value) {
        int lb = _22_BS_LowerBound_UpperBound.lowerBound(arr, n, value);
        int ub = _22_BS_LowerBound_UpperBound.upperBound(arr, n, value);
        if(lb == n || arr[lb] != value) return new int[]{-1, -1};
        return new int[]{lb, upperBound(arr, n, value) - 1};
    }
}
