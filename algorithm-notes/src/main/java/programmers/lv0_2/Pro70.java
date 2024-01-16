package programmers.lv0_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Pro70 {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = n ; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }
        return answer;
    }
    public static void main(String[] args){
        Pro70 pro70 = new Pro70();
        int[] num_list = {2, 1, 6};
        int n = 1;
        System.out.println(pro70.solution(num_list, n));
    }
}
