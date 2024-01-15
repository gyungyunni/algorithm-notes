package programmers.lv0_2;

// https://school.programmers.co.kr/learn/courses/30/lessons/181904
// 세로 읽기
public class Pro57 {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args){
        Pro57 pro57 = new Pro57();
        System.out.println(pro57.solution("ihrhbakrfpndopljhygc", 4, 2));
    }
}
