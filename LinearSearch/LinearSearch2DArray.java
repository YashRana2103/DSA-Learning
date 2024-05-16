package LinearSearch;
import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {42, 12, 2, 1},
                {5, 29, 76},
                {23, 9},
                {90, 8, 26, 2}
        };

        int target = 6;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        int[] ans;
        for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    ans=new int[]{row, col};
                    return ans;
                }
            }
        }
        ans=new int[]{-1, -1};
        return ans;
    }
}
