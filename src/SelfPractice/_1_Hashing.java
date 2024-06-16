package SelfPractice;

// wap to check how many a number appears in array

import java.util.Arrays;
import static java.lang.Math.max;

public class _1_Hashing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 4, 3, 2, 2, 4, 5, 5, 5, 5, 5, 5, 1, 1, 2, 3, 1};

        System.out.println(checkOccurance(arr, arr.length, 1));
    }

    public static int checkOccurance(int[] arr, int n, int number) {
        // create a hash array with size of max ele + 1 in arr
        int maxEle = arr[0];
        for(int ele: arr) {
            maxEle = max(maxEle, ele);
        }
        int[] hashArr = new int[(maxEle) + 1];

        // increment the values in hashArr if an element found in arr is = index value of hashArr
        for (int i = 0; i < n; i++) hashArr[arr[i]]++;

        System.out.println(Arrays.toString(hashArr));

        return hashArr[number];
    }
}
