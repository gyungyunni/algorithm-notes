package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181942
public class Pro19 {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += (str1.substring(i, i+1) + str2.substring(i, i+1));
        }
        return answer;
    }
    public static void main(String[] args) {
        Pro19 pro19 = new Pro19();
        System.out.println(pro19.solution("aaaaa", "bbbbb"));
    }
}