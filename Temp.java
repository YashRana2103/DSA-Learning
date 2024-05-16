import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=input.nextInt();
        System.out.print("Enter b:");
        int b=input.nextInt();

        Nums obj1=new Nums();
        System.out.println(obj1.sumNums(a,b));
    }
}

class Nums{
    public int sumNums(int num1, int num2){
        return num1+num2;
    }
}
