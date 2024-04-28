package programmers.stackQueue;

import programmers.lv1.Pro2;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
public class FunctionDev {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for(int ele : progresses){
            queue1.add(ele);
        }
        for(int ele : speeds){
            queue2.add(ele);
        }
        int num = 0;
        while (!queue1.isEmpty()) {
            for (int i = 0; i < queue1.size(); i++) {
                int progress = queue1.poll();
                int speed = queue2.poll();
                progress += speed;
                queue1.add(progress);
                queue2.add(speed);
            }
            num = 0;
            while (!queue1.isEmpty() && queue1.peek() >= 100) {
                queue1.poll();
                queue2.poll();
                num++;
            }
            if (num > 0) {
                arr.add(num);
            }
        }
        int[] answer = new int[arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            answer[j] = arr.get(j);
        }
        return answer;
    }
    public static void main(String[] args) {
        FunctionDev pro = new FunctionDev();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(pro.solution(progresses, speeds)));
    }

}
