package programmers.lv0_2;

import java.util.Arrays;
// https://school.programmers.co.kr/learn/courses/30/lessons/181899
// 카운트다운
public class Pro62 {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num + 1];
        int j =0;
        for (int i = start; i >= end_num ; i--) {
            answer[j] = i;
            j++;
        }
        return answer;
    }
    public static void main(String[] args){
        Pro62 pro62 = new Pro62();
        System.out.println(Arrays.toString(pro62.solution(10, 3)));
    }
}
