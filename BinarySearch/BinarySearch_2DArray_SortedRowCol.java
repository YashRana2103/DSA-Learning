package BinarySearch;

import java.util.Arrays;

public class BinarySearch_2DArray_SortedRowCol {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 10, 15, 20},
                {11, 16, 21, 26},
                {21, 25, 30, 35},
                {22, 27, 31, 36},
                {37, 38, 39, 40}
        };

        System.out.println(Arrays.toString(search(arr, 38)));
    }

    static int[] search(int[][] matrix, int target){
//        work only when row and col both are sorted
        int row = 0;
//        int col = matrix.length - 1; //In case of where row=col (n*n)
        int col = matrix[row].length - 1; //In case of where row!=col (n*m)

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
