package LeetCodes;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/

public class String_Halves_Alike {
    public static void main(String[] args) {
        String s = "Uo";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int count = 0;
        int mid = s.length() / 2;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(mid + i))) {
                count--;
            }
        }
        return count == 0;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
