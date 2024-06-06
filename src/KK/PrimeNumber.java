import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter 6969 to exit..(6969 is not prime)");
                System.out.print("Enter value: ");
                int value=input.nextInt();
                if(value==6969){
                    break;
                }
                System.out.println(isPrime(value));
        }

    }
    static boolean isPrime(int value){
        if(value<=1){
            return false;
        }
        int count=2;
        while((count*count)<=value){
            if(value%count==0){
                return false;
            }
            count++;
        }
        return (count*count)>value;
    }
}
