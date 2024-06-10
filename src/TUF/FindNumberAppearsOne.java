package TUF;

public class FindNumberAppearsOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4};

        System.out.println(numberAppearsOne(arr, arr.length));
    }
    
    private static int numberAppearsOne(int[] arr, int n) {
        int sizeOfHashArr = (arr[n - 1]) + 1;

        int[] hashArr = new int[sizeOfHashArr];

        for (int i = 0; i < n; i++) {
            hashArr[arr[i]]++;
        }

        for (int i = arr[0]; i < hashArr.length; i++) {
            if(hashArr[i] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
