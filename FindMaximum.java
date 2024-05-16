public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {9, 2, -1, -29, -10, 10, 69};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
