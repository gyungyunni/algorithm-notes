package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181925
// 수 조작하기2
public class Pro36 {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            switch(numLog[i] - numLog[i-1]){
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
                default:
                    break;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Pro36 pro36 = new Pro36();
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(pro36.solution(numLog));
    }
}
