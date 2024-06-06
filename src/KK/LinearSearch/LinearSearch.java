package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);

        int[] arr={18, 12, -7, 3, 14, 28};

//        System.out.println("Enter the array Elements");
//        System.out.println();
//        for(int i=0;i<arr.length;i++){
//            System.out.print("array["+i+"]:");
//            arr[i]=input.nextInt();
//            System.out.println();
//        }

//        System.out.print("Enter the number to search in array:");
//        int number=input.nextInt();
        int number=3;
        int start=1;
        int end=4;
        System.out.println(linearSearch(arr,number,start,end));
    }

    static boolean linearSearch(int[] arr, int number,int start, int end) {
        if(arr.length==0){
            return false;
        }
        for(int index=start;index<end;index++){
            if(arr[index]==number){
                return true;
            }
        }
        return false;
    }
}
