package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class Pro13 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < score.length; i++) {
            if(temp.size() < k) {
                temp.add(score[i]);
                Collections.sort(temp);
                answer[i] = temp.get(0);
                continue; // 없으면 (temp.size() == k)가 될때 다음 블록 실행함. continue로 다음 i로
            }

            if(temp.size() == k) {
                int minNum = temp.get(0);

                if(minNum < score[i]) {
                    temp.remove(0);
                    temp.add(score[i]);
                    Collections.sort(temp);
                }

                answer[i] = temp.get(0);
            }
        }
        return answer;
    }
    /*
      public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int temp = 0;
        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll(); // 4개 중에 가장 낮은 점수 빼기. 오름차순으로 정렬돼있어서 맨 앞에 있는게 가장 낮은 점수
            }
            answer[i] = priorityQueue.peek();
        }
        return answer;
    }
     */
    public static void main(String[] args){
        Pro13 pro13 = new Pro13();
        int k =3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(pro13.solution(k, score)));
    }
}
