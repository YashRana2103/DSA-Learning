package LeetCodes;

// https://leetcode.com/problems/valid-palindrome-ii/

public class StringPalindrome2 {
    public static void main(String[] args) {
        String str = "deeee";
        System.out.println(validPalindrome(str));
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // If characters at left and right don't match, check the substrings
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    // Helper function to check if a substring is a palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
