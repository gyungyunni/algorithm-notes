package programmers.lv0_2;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181888
// n개 간격의 원소들
public class Pro73 {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i+=n) {
            answer.add(num_list[i]);
        }
        return answer;
    }
    public static void main(String[] args){
        Pro73 pro73 = new Pro73();
        int[] num_list ={4, 2, 6, 1, 7, 6};
        int n = 2;
        System.out.println(pro73.solution(num_list, n));
    }
}
