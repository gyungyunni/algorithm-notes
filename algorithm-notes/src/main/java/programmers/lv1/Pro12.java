package programmers.lv1;
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pro12 {
    public int solution(String s) {
        int answer = 0;
        List<Character> list = new ArrayList<>();
        int x =0;
        int y =0;
        // abracadabra
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(list.isEmpty()) {
                list.add(ch);
                x++;
            }
            else {
                if(list.contains(ch)){
                    x++;
                }
                else {    // x가 아닌 글자
                    y++;
                }
            }
            if(x == y){
                answer ++;
                list.clear();
            }
            if(x!=y && i == s.length()-1){
                answer ++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Pro12 pro12 = new Pro12();
        String s = "abracadabra";
        System.out.println(pro12.solution(s));
    }
}
