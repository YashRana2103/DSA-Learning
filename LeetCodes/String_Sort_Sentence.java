package LeetCodes;

import java.util.Arrays;

public class String_Sort_Sentence {
    public static void main(String[] args) {
        String sentence = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(sentence));
    }

    public static String sortSentence(String s) {
        String[] sentenceWords = s.split(" ");
        int i = 0;
        while (i < sentenceWords.length) {
            if (sentenceWords[i].charAt(sentenceWords[i].length() - 1) == (char) ('0' + i + 1)) {
                i++;
            } else {
                int correct = Integer.parseInt(String.valueOf(sentenceWords[i].charAt(sentenceWords[i].length() - 1)));

                String temp = sentenceWords[i];
                sentenceWords[i] = sentenceWords[correct - 1];
                sentenceWords[correct - 1] = temp;
            }
        }
//        System.out.println(Arrays.toString(sentenceWords));

        for (int j = 0; j < sentenceWords.length; j++) {
            sentenceWords[j] = sentenceWords[j].substring(0, sentenceWords[j].length() - 1);
        }
//        System.out.println(Arrays.toString(sentenceWords));

        StringBuilder newString = new StringBuilder();

        for (String word: sentenceWords){
            if(sentenceWords[sentenceWords.length - 1] == word){
                newString.append(word);
            } else {
                newString.append(word).append(" ");
            }
        }

        return newString.toString().trim();
    }
}
