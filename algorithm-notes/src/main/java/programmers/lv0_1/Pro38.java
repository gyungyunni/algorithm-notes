package programmers.lv0_1;

import java.util.ArrayList;
import java.util.Collections;

// https://school.programmers.co.kr/learn/courses/30/lessons/181923
// 수열과 구간 쿼리2
public class Pro38 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int value = queries[i][2];
            list.clear();
            for (int j = start; j <= end; j++) {
                if (arr[j] > value) {
                    list.add(arr[j]);
                }
            }
            if (list.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = Collections.min(list);
            }
        }
        return answer;
    }

}
