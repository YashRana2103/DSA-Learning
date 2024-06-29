package selfpractice;

public class _30_BS_Peek {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 9, 10, 7, 2, 0};
        System.out.println(peek(arr, arr.length));
    }
    public static int peek(int[] arr, int n) {
        if(n == 1) return arr[0];
        if(arr[0] > arr[1]) return arr[0];
        if(arr[n - 1] > arr[n - 2]) return arr[n - 1];
        int l = 1, h = n - 2;
        while(l <= h) {
            int m = l + (h - l) / 2;
            if(arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) return arr[m];
            else if(arr[m] > arr[m - 1]) l = m + 1;
            else h = m - 1;
        }
        return -1;
    }
}
