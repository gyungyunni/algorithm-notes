package programmers.lv0_1;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/181911
// 부분 문자열 이어 붙여 문자열 만들기
public class Pro50 {
    public String solution(String[] my_strings, int[][] parts) {

        //성능과 메모리 위해 String answer 해서 + 로 문자열 이어붙이지 말고 stringBuilder 사용
        StringBuilder answerBuilder = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            String temp = my_strings[i].substring(parts[i][0], parts[i][1] + 1);
            answerBuilder.append(temp);
        }

        return answerBuilder.toString();
    }
    public static void main(String[] args) {
        Pro50 pro50 = new Pro50();
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
        System.out.println(pro50.solution(my_strings, parts));
    }
}
