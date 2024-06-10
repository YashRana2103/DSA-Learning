package TUF;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};

        System.out.println(missingNumber(arr, 6));
    }

    private static int missingNumber(int[] arr, int n) {
//        return betterSol(arr, n);
        return optimalSol(arr, n);
    }

    private static int betterSol(int[] arr, int n){
        int[] hashArr = new int[n+1];

        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]]++;
        }

        for (int i = 1; i < hashArr.length; i++) {
            if(hashArr[i] == 0){
                return i;
            }
        }
        return -1;
    }

    private static int optimalSol(int[] arr, int n) {
        int calculatedSum = 0;

        for (int i = 0; i < arr.length; i++) {
            calculatedSum += arr[i];
        }

        return ((n * (n + 1)) / 2) - calculatedSum;

//        ((n * (n + 1)) / 2) is the actual sum
    }
 }
