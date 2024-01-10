package programmers.lv0_1;

public class Pro28 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag ? a + b : a-b;
        return answer;
    }
    public static void main(String[] args){
        Pro28 pro28 = new Pro28();
        System.out.println(pro28.solution(-4, 7, true));
    }
}
