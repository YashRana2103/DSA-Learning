public class StringPalindrome {
    public static void main(String[] args) {
        String str = "ya: s, h say";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
