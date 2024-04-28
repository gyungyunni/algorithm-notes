package programmers.stackQueue;


import java.util.*;

public class Process {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    if (i == location) {
                        answer++;
                        return answer;
                    } else {
                        queue.poll();
                        answer++;
                    }
                }
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        Process pro = new Process();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(pro.solution(priorities, location));
    }
}
