package tuf;

import static java.lang.Math.max;

public class _15_FindNumberAppearsOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};

        System.out.println(numberAppearsOne(arr, arr.length));
    }
    
    private static int numberAppearsOne(int[] arr, int n) {
//        return betterSol(arr, n);
        return optimalSol(arr, n);
    }

    private static int betterSol(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = max(arr[i], max);
        }

        int sizeOfHashArr = max + 1;

        int[] hashArr = new int[sizeOfHashArr];

        for (int i = 0; i < n; i++) {
            hashArr[arr[i]]++;
        }

        for (int i = arr[0]; i < hashArr.length; i++) {
            if(hashArr[i] == 1) {
                return i;
            }
        }

        return -1;
    }

    private static int optimalSol(int[] arr, int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }
        return xor;
    }
}
