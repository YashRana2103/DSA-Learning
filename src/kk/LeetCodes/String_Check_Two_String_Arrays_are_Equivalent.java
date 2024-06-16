package LeetCodes;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class String_Check_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] sArr1 = {"a", "cb"};
        String[] sArr2 = {"ab", "c"};

        System.out.println(arrayStringsAreEqual(sArr1, sArr2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        appendString(s1, word1);
        appendString(s2, word2);

        return s1.toString().contentEquals(s2);
    }

    private static void appendString(StringBuilder str, String[] arr){
        for (String element: arr) {
            str.append(element);
        }
    }
}
