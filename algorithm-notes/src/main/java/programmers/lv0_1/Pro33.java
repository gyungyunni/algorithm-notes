package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181928
// 이어 붙인 수
public class Pro33 {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;

        for(int i = 0;i < num_list.length;i++){
            if(num_list[i] % 2 == 0) {
                even *= 10;
                even += num_list[i];
            }
            else {
                odd *= 10;
                odd += num_list[i];
            }
        }
        answer = even + odd;
        return answer;
    }
}
