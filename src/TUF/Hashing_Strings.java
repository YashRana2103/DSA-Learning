package TUF;

import java.util.Scanner;

public class Hashing_Strings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        int[] hashArray = createHashArray(str);

        System.out.println();

        char ch = 'y';
        System.out.println(ch+" appears "+checkNumbers(hashArray, ch)+" times in the data");
        System.out.print("-------------------------------------");
    }

    private static int checkNumbers(int[] hashArr, char ch) {
        return hashArr[ch - 'a'];
    }

    private static int[] createHashArray(String str) {
        int[] hashArr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            hashArr[str.charAt(i) - (int) 'a']++;
        }
        return hashArr;
    }
}
