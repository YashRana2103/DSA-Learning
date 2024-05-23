package LeetCodes;

// https://leetcode.com/problems/shuffle-string/

public class String_ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] newString = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            newString[indices[i]] = s.charAt(i);
        }

        return new String(newString);
    }
}
