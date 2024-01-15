package programmers.lv0_2;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181902
// 문자 개수 세기
public class Pro59 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 'a')
                answer[c - 'a' + 26]++;
            else
                answer[c - 'A']++;
        }
        return answer;
    }
    public static void main(String[] args){
        Pro59 pro59 = new Pro59();
        System.out.println(Arrays.toString(pro59.solution("Programmers")));
    }
}
