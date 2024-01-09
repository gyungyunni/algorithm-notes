package programmers.lv0_1;

public class Pro6 {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Pro6 pro6 = new Pro6();

        // 예시로 사용할 데이터 생성
        int[] numbers = {1};
        int[] ourScore = {100};
        int[] scoreList = {100, 80, 90, 84, 20};

        // solution 메서드 호출
        String[] result = pro6.solution(numbers, ourScore, scoreList);

        // 결과 출력
        for (String res : result) {
            System.out.println(res);
        }
    }
}
