package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181943
public class Pro18 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string  + my_string.substring(s + overwrite_string.length());
        return answer;
    }

    public static void main(String[] args) {
        Pro18 pro18 = new Pro18();
        System.out.println(pro18.solution("He11oWor1d", "lloWorl", 2));
    }
}