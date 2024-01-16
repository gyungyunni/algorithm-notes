package programmers.lv0_2;

public class Pro81 {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int ele : num_list) {
            while (ele != 1) {
                if (ele % 2 == 0) {
                    ele /= 2;
                } else if (ele % 2 == 1) {
                    ele = (ele - 1) / 2;
                }
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pro81 pro81 = new Pro81();
        int[] num_list = {12, 4, 15, 1, 14};
        System.out.println(pro81.solution(num_list));
    }
}
