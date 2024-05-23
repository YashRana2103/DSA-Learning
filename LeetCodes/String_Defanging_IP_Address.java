package LeetCodes;

// https://leetcode.com/problems/defanging-an-ip-address/

public class String_Defanging_IP_Address {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    private static String defangIPaddr(String s){
        if (s == null || s.isEmpty()) {
            return "";
        }

        char delimiter = '.';
        StringBuilder resultantString = new StringBuilder();
        for (char ch: s.toCharArray()){
            if (ch == delimiter){
                resultantString.append("[.]");
            } else {
                resultantString.append(ch);
            }
        }
        return resultantString.toString();
    }
}
