package programmers.lv0_1;
// https://school.programmers.co.kr/learn/courses/30/lessons/181937
public class Pro24 {
    public int solution(int num, int n) {
        int answer = 0;

        answer = (num % n == 0) ? 1 : 0;

        return answer;
    }
    public static void main(String[] args) {
        Pro24 pro24 = new Pro24();
        System.out.println(pro24.solution(98, 2));
    }
}