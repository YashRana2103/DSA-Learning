public class Patterns {

    // Common Steps:
//    Step 1: no of lines = no of rows = no of times outer loop will run
//
//    step 2: identify for every row no,
//        1. how many cols are there
//        2. types of element in col
//
//    step 3: what do you want to print

    public static void main(String[] args) {
        pattern17(5);
    }

    public static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int row = 0; row <= n * 2; row++) {
            int totalCol = row > n ? (2 * n - row) : row;
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n){
        for (int row = 0; row <= n * 2; row++) {
            int totalCol = row > n ? (2 * n - row) : row;

            int noOfSpaces = n - totalCol;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            int totalCol = row;

            for (int s = 1; s <= n - totalCol; s++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for (int row = 1; row <= n * 2; row++) {
            int c = row > n ? (2 * n - row) : row;

            for (int s = 0; s <= n - c; s++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col+" ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
