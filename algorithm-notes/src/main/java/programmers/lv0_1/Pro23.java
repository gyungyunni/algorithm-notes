package programmers.lv0_1;

public class Pro23 {
    public int solution(int a, int b) {

        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = (2 * a * b);
        answer = aLong > bLong ? aLong : bLong;

        return answer;
    }

    public static void main(String[] args) {
        Pro23 pro23 = new Pro23();
        System.out.println(pro23.solution(2, 91));
    }
}