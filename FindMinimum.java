import java.sql.SQLOutput;
import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {9, 2, -1, -29, -10, 10, 69};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

}
