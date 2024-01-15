package programmers.lv0_2;

// https://school.programmers.co.kr/learn/courses/30/lessons/181903
// qr code
public class Pro58 {
    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if(i%q == r){
                answer += code.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Pro58 pro58 = new Pro58();
        System.out.println(pro58.solution(3, 1, "qjnwezgrpirldywt"));
    }
}
