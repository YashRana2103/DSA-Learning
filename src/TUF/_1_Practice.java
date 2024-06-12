package TUF;

public class _1_Practice {
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 9, 7, 5};
        String str = "Yahhay";

//        print1ToN(1, 69);
//        printNTo1(5);
//        System.out.println(sum1ToN(1, 2, 0));
//        System.out.println(fact(1,4, 1));

        int start = 0;
//        System.out.println(Arrays.toString(reverseArr(arr, start)));

//        System.out.println(isPalindrome(str, start));

        System.out.println(fibo(4));
    }


    private static void print1ToN(int start, int end) {
        if (start>end){
            return;
        }
        System.out.print(start+" ");
        print1ToN(start+1, end);
    }

    private static void printNTo1(int n) {
        if (n<1){
            return;
        }
        System.out.print(n+" ");
        printNTo1(n-1);
    }

    private static int sum1ToN(int i, int n, int sum) {
        if (i>n){
            return sum;
        }
        return sum1ToN(i+1, n, sum+i);
    }

    private static int fact(int i, int n, int fact) {
        if(i==n){
            return fact*=i;
        }
        return fact(i+1, n, fact*i);
    }

    private static int[] reverseArr(int[] arr,int start) {
        if(start > arr.length - start - 1) {
            return arr;
        }
        swap(arr, start, arr.length - start - 1);
        return reverseArr(arr, start+1);
    }

    static void swap(int[] arr, int val1, int val2) {
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }

    private static boolean isPalindrome(String str, int start) {
        str = str.toLowerCase();
        if(start > str.length() - start - 1) {
            return true;
        }
        if(str.charAt(start) != str.charAt(str.length() - start - 1)) {
            return false;
        }
        return isPalindrome(str, start+1);
    }

    private static int fibo(int n) {
        int[] arr = new int[n];
        if(n<=1){
            if(n==0) return 0;
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
