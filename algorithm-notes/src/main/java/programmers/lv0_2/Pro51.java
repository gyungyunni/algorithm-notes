package programmers.lv0_2;

// https://school.programmers.co.kr/learn/courses/30/lessons/181910
// 문자열의 뒤의 n글자
public class Pro51 {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n);
        return answer;
    }
    public static void main(String[] args){
        Pro51 pro51 = new Pro51();
        System.out.println(pro51.solution("ProgrammerS123",11));
    }
}
