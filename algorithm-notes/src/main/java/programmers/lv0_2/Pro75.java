package programmers.lv0_2;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181886
// 5명씩
public class Pro75 {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length-1)/5+1];
        for(int i=0; i<answer.length; i++) {
            answer[i] = names[5*i];
        }
        return answer;
    }
    public static void main(String[] args){
        Pro75 pro75 = new Pro75();
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(pro75.solution(names)));
    }
}
