package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181934
// 조건 문자열
public class Pro27 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean compare;
        if(ineq.equals(">") && eq.equals("=")){
            compare = n >= m;
            answer = compare ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            compare = n <= m;
            answer = compare ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            compare = n > m;
            answer = compare ? 1 : 0;
        }else if (ineq.equals("<") && eq.equals("!")) {
            compare = n < m;
            answer = compare ? 1 : 0;
        }
        return answer;
    }
    public static void main(String[] args){
        Pro27 pro27 = new Pro27();
        System.out.println(pro27.solution("<", "=", 20, 50));
    }
}
