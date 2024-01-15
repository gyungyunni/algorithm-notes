package programmers.lv0_2;

import java.util.ArrayList;

// 접미사인지 확인하기
// endsWith(), startsWith() 접두사 접미사 메소드
// https://school.programmers.co.kr/learn/courses/30/lessons/181908
public class Pro53 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList suffix = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            suffix.add(my_string.substring(i));
        }
        for (Object e : suffix){
            if(e.equals(is_suffix)){
                answer = 1;
            }
        }
        return answer;
    }
    // return myString.endsWith(isSuffix) ? 1 : 0;
    public static void main(String[] args){
        Pro53 pro53 = new Pro53();
        System.out.println(pro53.solution("banana","nan"));
    }
}