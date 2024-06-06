package TUF;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int sizeOfArray = input.nextInt();

        int[] arr = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = input.nextInt();
        }

        int[] hashArray = createHashArray(arr, sizeOfArray);

        System.out.println();

        System.out.print("How many times do you want to check: ");
        int checkTime = input.nextInt();

        for (int i = 0; i < checkTime; i++) {
            System.out.println();
            System.out.println("check "+(i+1)+": ");
            System.out.print("Enter number to check: ");
            int number = input.nextInt();
            System.out.println(number+" appears "+checkNumbers(hashArray, number, sizeOfArray)+" times in the data");
            System.out.print("-------------------------------------");
        }
    }
    
    private static int checkNumbers(int[] hashArr, int number, int sizeOfArray) {
        return hashArr[number];
    }

    private static int[] createHashArray(int[] arr, int sizeOfArray) {

        int[] hashArr = new int[(Arrays.stream(arr).max().getAsInt())+1];

        for (int i = 0; i < sizeOfArray; i++) {
            hashArr[arr[i]]++;
        }
        return hashArr;
    }
}
