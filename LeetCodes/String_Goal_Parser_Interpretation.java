package LeetCodes;

// https://leetcode.com/problems/goal-parser-interpretation/

public class String_Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String s = "G()()()()(al)";
        System.out.println(interpret(s));
    }

    public static String interpret(String command) {
        StringBuffer newString = new StringBuffer();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G'){
                newString.append('G');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                newString.append('o');
                i = i + 1;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a'){
                newString.append("al");
                i = i + 2;
            }
        }
        return newString.toString();
    }
}
