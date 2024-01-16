package programmers.lv0_2;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/181892
// n 번째 원소부터
public class Pro69 {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = n - 1; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        return answer;
    }
    /*
        public int[] solution(int[] num_list, int n) {
        int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length);
        return a;
    }
     */
    public static void main(String[] args){
        Pro69 pro69 = new Pro69();
        int[] num_list = {2, 1, 6};
        int n = 3;
        System.out.println(pro69.solution(num_list, n));
    }
}
