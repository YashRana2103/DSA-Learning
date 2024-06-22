package tuf;
import static tuf._23_BS_FirstLastOccurance.*;

public class _24_BS_NumberOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 6, 6, 7};
        System.out.println(numberOccurance(arr, arr.length, 3));
    }
    public static int numberOccurance(int[] arr, int n, int value) {
        int[] firstLastOccurance = _23_BS_FirstLastOccurance.firstLastOccurance_BS(arr, n, value);
        if(firstLastOccurance[0] == -1) return 0;
        return (firstLastOccurance[1] - firstLastOccurance[0]) + 1;
    }
}
