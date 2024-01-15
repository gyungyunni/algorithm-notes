package programmers.lv0_1;
// https://school.programmers.co.kr/learn/courses/30/lessons/181913
// 문자열 여러 번 뒤집기
import java.util.ArrayList;
import java.util.Arrays;

public class Pro48 {
    public String solution(String my_string, int[][] queries) {
        ArrayList<String> myString = new ArrayList<>(Arrays.asList(my_string.split("")));

        for (int[] query : queries) {
            reverseSubstring(myString, query[0], query[1]);
        }

        StringBuilder answerBuilder = new StringBuilder();
        for (String s : myString) {
            answerBuilder.append(s);
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

    public static void main(String[] args) {
        Pro48 pro48 = new Pro48();
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(pro48.solution("rermgorpsam", queries));
    }
}
