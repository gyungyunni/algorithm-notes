package programmers.lv0_2;

import java.util.ArrayList;
import java.util.Arrays;

/*
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    }
}
 */
public class Pro56 {
    public String solution(String my_string, int s, int e) {
        ArrayList<String> myString = new ArrayList<>(Arrays.asList(my_string.split("")));

        reverseSubstring(myString,s, e);

        StringBuilder answerBuilder = new StringBuilder();
        for (String str : myString) {
            answerBuilder.append(str);
        }

        return answerBuilder.toString();
    }

    private void reverseSubstring(ArrayList<String> list, int start, int end) {
        while (start < end) {
            String temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Pro56 pro56 = new Pro56();
        System.out.println(pro56.solution("Progra21Sremm3", 6, 12));
    }
}
