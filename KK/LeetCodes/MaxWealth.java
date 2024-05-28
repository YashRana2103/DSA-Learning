package LeetCodes;

public class MaxWealth {
//    https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {15,5}
        };
        System.out.println(maximumWealth(accounts));
    }

    static public int maximumWealth(int[][] arr) {
        int[] accWealth = new int[arr.length];
        for(int row = 0; row < arr.length; row++)
            for(int col = 0; col < arr[row].length; col++)
                accWealth[row] += arr[row][col];
        return max(accWealth);
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
            if(max<arr[i])
                max=arr[i];
        return max;
    }
}

//public class MaxWealth {
//    //    https://leetcode.com/problems/richest-customer-wealth/description/
//    public static void main(String[] args) {
//        int[][] accounts = {
//                {55,5},
//                {7,3},
//                {15,15}
//        };
//        System.out.println(maximumWealth(accounts));
//    }
//
//    static public int maximumWealth(int[][] arr) {
//        int accWealth = 0;
//        int max = 0;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                accWealth += arr[row][col];
//            }
//            if (max < accWealth) {
//                max = accWealth;
//            }
//            accWealth=0;
//        }
//        return max;
//    }
//}