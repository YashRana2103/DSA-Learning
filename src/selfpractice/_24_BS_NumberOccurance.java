package selfpractice;
import static selfpractice._23_BS_FirstLastOccurance.*;

public class _24_BS_NumberOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 6, 6, 6, 9, 15, 20};
        System.out.println(numberOccurance(arr, arr.length, 6));
    }
    public static int numberOccurance(int[] arr, int n, int value) {
        int[] firstLastOcc = _23_BS_FirstLastOccurance.firstLastOccurance_BS(arr, n, value);
        if(firstLastOcc[0] == -1) return 0;
        return (firstLastOcc[1]) - (firstLastOcc[0]) + 1;
    }
}
