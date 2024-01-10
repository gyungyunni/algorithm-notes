package programmers.lv0_1;
// https://school.programmers.co.kr/learn/courses/30/lessons/181940
public class Pro21 {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
        // return my_string.repeat(k);
    }
    public static void main(String[] args) {
        Pro21 pro21 = new Pro21();
        System.out.println(pro21.solution("string", 3));
    }
}
