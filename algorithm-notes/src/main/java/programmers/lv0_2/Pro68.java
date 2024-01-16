package programmers.lv0_2;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/181893
// 배열 조각하기
public class Pro68 {
    public ArrayList<Integer> solution(int[] arr, int[] query) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int ele : arr)
            answer.add(ele);

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                for (int j = answer.size() - 1; j > query[i]; j--) {
                    answer.remove(j);
                }
            } else {
                for (int k = query[i] - 1; k >= 0; k--) {
                    answer.remove(k);
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Pro68 pro68 = new Pro68();
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {1, 1, 1};
        System.out.println(pro68.solution(arr, query));
    }
}
/*
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }
}
 */
