package programmers.lv0_2;

// https://school.programmers.co.kr/learn/courses/30/lessons/181877
// 대문자로 바꾸기
public class Pro84 {
    public String solution(String myString) {
        String answer = "";
        answer = myString.toUpperCase();
        return answer;
    }
    public static void main(String[] args) {
        Pro84 pro84 = new Pro84();
        String myString = "aBcDeFg";
        System.out.println(pro84.solution(myString));
    }
}
