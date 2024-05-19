package BinarySearch;

import java.util.Arrays;

public class BinarySearch_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 10, 15, 20},
                {11, 16, 21, 26},
                {21, 25, 30, 35},
                {27, 32, 37, 42}
        };

        System.out.println(Arrays.toString(search(arr, 4)));
    }

    static int[] search(int[][] matrix, int target){
//        work only when row and col both are sorted
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            } else if(matrix[row][col]<target){
                row++;
            } else {
                col--;
            }
        }

        return new int[]{-1, -1};
    }
}
