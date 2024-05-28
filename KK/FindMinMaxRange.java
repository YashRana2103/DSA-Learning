public class FindMinMaxRange {
    public static void main(String[] args) {
        int[] arr= new int[]{32, 12, -67, 1, 4, -20, 90, -69};
        System.out.println(min(arr,2,7));
        System.out.println(max(arr,1,5));
    }

    private static int min(int[] arr, int start, int end) {
        int min=arr[start];
        for(int i=start;i<=end;i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        return min;
    }

    private static int max(int[] arr, int start, int end) {
        int max=arr[start];
        for(int i=start;i<=end;i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
