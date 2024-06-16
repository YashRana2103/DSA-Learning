package tuf;

public class _2_Fibo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(fibo(i)+" ");
        }
    }

    static int fibo(int n){
        if (n < 2){
            if (n == 1){
                return 0;
            } else {
                return 1;
            }
        }

        return fibo (n - 1) + fibo (n - 2);
    }
}
