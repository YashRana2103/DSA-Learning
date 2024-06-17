package selfpractice;

import static java.lang.Math.max;

public class _13_NumberAppearsOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 10, 3, 9, 10, 7, 9};
        System.out.println(numberAppearsOne(arr, arr.length));
    }
    public static int numberAppearsOne(int[] arr, int n) {
        return better(arr, n);
//        return optimal(arr, n);
    }
    static int better(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = max(max, arr[i]);
        }
        int[] hashArr = new int[max + 1];
        for (int i = 0; i < n; i++) hashArr[arr[i]]++;
        for (int i = 0; i < max + 1; i++)
            if(hashArr[i] == 1)
                return i;
        return -1;
    }
}
