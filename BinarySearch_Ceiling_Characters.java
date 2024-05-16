public class BinarySearch_Ceiling_Characters {
    public static void main(String[] args) {
        char[] arr = { 'e', 'f', 'j', 'm', 'r', 'u', 'w', 'y' };

        char target = 'e';
        char result = (char) ceiling(arr, target);
        System.out.println(result);
    }

    static int ceiling(char[] letters, char target) {
//        if(target >= letters[letters.length-1]){
//            return letters[0];
//        }

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int middle = start + ((end - start) / 2);

            if (target >= letters[middle]) {
                start = middle + 1;
            } else if (target < letters[middle]) {
                end = middle - 1;
            }
        }
        return letters[start % letters.length];
    }
}
