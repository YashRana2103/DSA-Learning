package selfpractice;

public class _11_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        System.out.println(findMissingNumber(arr, arr.length, 6));
    }
    public static int findMissingNumber(int[] arr, int n, int N) {
        return better(arr, n, N);
//        return optimal(arr, n, N);
    }
    public static int better(int[] arr, int n, int N) {
        int[] hashArray = new int[N + 1];
        for (int i = 0; i < n; i++) hashArray[arr[i]]++;
        for (int i = 1; i < N + 1; i++) if(hashArray[i] == 0) return i;
        return -1;
    }
    public static int optimal(int[] arr, int n, int N) {
        
    }
}
