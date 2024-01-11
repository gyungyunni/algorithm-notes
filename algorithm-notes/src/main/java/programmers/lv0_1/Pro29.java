package programmers.lv0_1;
// https://school.programmers.co.kr/learn/courses/30/lessons/181932
// 코드 처리하기
public class Pro29 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if ((mode == 0) && ((i % 2) == 0) && !(code.substring(i, i + 1).equals("1"))) {
                answer += code.substring(i, i + 1);
                if (code.substring(i, i + 1).equals("1")) {
                    mode = 1;
                }
            } else if ((mode == 1) && ((i % 2) == 1) && !(code.substring(i, i + 1).equals("1"))) {
                answer += code.substring(i, i + 1);
                if (code.substring(i, i + 1).equals("1")) {
                    mode = 0;
                }
            } else if (code.substring(i, i + 1).equals("1")) {
                mode = (mode + 1) % 2;
            }
        }
        if(answer.isEmpty()){
            answer = "EMPTY";
        }
        return answer;
    }
    public static void main(String[] args){
        Pro29 pro29= new Pro29();
        System.out.println(pro29.solution("abc1abc1abc"));
    }
}
