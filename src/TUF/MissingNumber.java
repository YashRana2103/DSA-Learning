package TUF;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(missingNumber(arr, 6));
    }

    private static int missingNumber(int[] arr, int n) {
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
}
