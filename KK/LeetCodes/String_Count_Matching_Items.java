package LeetCodes;

// https://leetcode.com/problems/count-items-matching-a-rule/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_Count_Matching_Items {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "phone"));
        items.add(List.of("phone", "gold", "iphone"));

        String ruleKey = "type";
        String ruleValue = "phone";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j = 0;
        int count = 0;
        if (ruleKey.equals("type")){
            j = 0;
        } else if (ruleKey.equals("color")){
            j = 1;
        } else if (ruleKey.equals("name")){
            j = 2;
        }

        for (int i = 0; i < items.size(); i++){
            if (items.get(i).get(j).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
