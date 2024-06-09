package TUF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4};

        System.out.println(Arrays.toString(moveZeroToEnd(arr)));
    }

    private static int[] moveZeroToEnd(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}
