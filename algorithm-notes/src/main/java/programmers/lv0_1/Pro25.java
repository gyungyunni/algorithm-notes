package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181936
// 공배수
public class Pro25 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        answer = (number % n == 0 && number % m == 0) ? 1 : 0;
        return answer;
    }
    public static void main(String[] args) {
        Pro25 pro25 = new Pro25();
        System.out.println(pro25.solution(60, 2, 3));
    }
}