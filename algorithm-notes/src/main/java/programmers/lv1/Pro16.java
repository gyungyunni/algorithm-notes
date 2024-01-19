package programmers.lv1;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class Pro16 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        PriorityQueue<Integer> scoreQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.addAll(scoreQ, Arrays.stream(score).boxed().toArray(Integer[]::new));
        while(scoreQ.size()>=m) {
            for (int i = 0; i < m; i++) {
                if (i == m - 1) {
                    answer += scoreQ.poll() * m;
                } else {
                    scoreQ.poll();
                }

            }
        }
        return answer;
    }
    /* 굳이 우선순위 큐 안써도 됨
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }

     */
    public static void main(String[] args){
        Pro16 pro16 = new Pro16();
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(pro16.solution(k, m, score));
    }
}
