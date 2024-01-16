package programmers.lv0_2;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181895
// 배열 만들기 3
public class Pro66 {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int[] ele : intervals){
            for (int i = ele[0]; i <= ele[1]; i++) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Pro66 pro66 = new Pro66();
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals ={{1,3},{0,4}};
        System.out.println(pro66.solution(arr, intervals));
    }
}
