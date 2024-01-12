package programmers.lv0_1;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/181922
// 수열과 구간 쿼리 4
public class Pro39 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int value = queries[i][2];

            for (int j = start; j <= end; j++) {
                if (j % value == 0 || j == 0) {
                    answer[j] += 1;
                }
            }
        }
        return answer;
    }
}