package programmers.lv0_2;
// https://school.programmers.co.kr/learn/courses/30/lessons/181876
public class Pro85 {
    public String solution(String myString) {
        String answer = "";
        answer = myString.toLowerCase();
        return answer;
    }
    public static void main(String[] args) {
        Pro85 pro85 = new Pro85();
        String myString = "aBcDeFg";
        System.out.println(pro85.solution(myString));
    }
}
