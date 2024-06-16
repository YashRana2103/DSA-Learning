public class MinMax2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 7, 90, 15},
                {-99, 1, 78},
                {12, 56, 1001, 45, 67},
                {1, 0}
        };

        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    private static int min(int[][] array) {
        int min=array[0][0];

        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                if(array[row][col]<min){
                    min=array[row][col];
                }
            }
        }

        return min;
    }

    private static int max(int[][] array) {
        int max=array[0][0];

        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                if(array[row][col]>max){
                    max=array[row][col];
                }
            }
        }

        return max;
    }
}
