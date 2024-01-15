package programmers.lv0_2;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181901
// 배열 만들기 1
public class Pro60 {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = k; i <= n; i+=k) {
            answer.add(i);
        }
        return answer;
    }
    public static void main(String[] args){
        Pro60 pro60 = new Pro60();
        System.out.println(pro60.solution(15,5));
    }
}
