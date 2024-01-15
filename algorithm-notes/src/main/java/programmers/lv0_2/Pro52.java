package programmers.lv0_2;

import java.util.ArrayList;
import java.util.Collections;

// https://school.programmers.co.kr/learn/courses/30/lessons/181909
// 접미사 배열
public class Pro52 {
    public ArrayList solution(String my_string){
        ArrayList answer = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            answer.add(my_string.substring(i));
        }
        Collections.sort(answer);
        return answer;
    }
    public static void main(String[] args){
        Pro52 pro52 = new Pro52();
        System.out.println((pro52.solution("banana")));
    }
}