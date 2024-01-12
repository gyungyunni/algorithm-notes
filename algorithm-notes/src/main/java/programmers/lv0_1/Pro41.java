package programmers.lv0_1;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/181920
// 카운트업
public class Pro41 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for (int i = start_num-1; i < end_num; i++) {
            answer[i - start_num + 1] = (i+1);
        }
        return answer;
    }
    /*
    class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }
     */
    public static void main(String[] args){
        Pro41 pro41 = new Pro41();
        System.out.println(Arrays.toString(pro41.solution(3, 10)));
    }
}
