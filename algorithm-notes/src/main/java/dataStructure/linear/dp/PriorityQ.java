package dataStructure.linear.dp;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        // 빈 우선순위 큐 생성
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();

        // 원소를 포함한 우선순위 큐 생성
        PriorityQueue<Integer> myPriorityQueueWithElements = new PriorityQueue<>(List.of(3, 1, 4, 1, 5, 9, 2, 6));

        // 우선순위 큐에 원소 추가
        myPriorityQueue.add(5);
        myPriorityQueue.add(2);
        myPriorityQueue.add(8);

        // 우선순위 큐에서 최솟값 추출
        int minValue = myPriorityQueue.poll();
        System.out.println(minValue);

        // 우선순위 큐에서 최솟값 조회 (제거하지 않고)
        int peekMinValue = myPriorityQueue.peek();
        System.out.println(peekMinValue);

        // 원소를 추가하지 않고 최솟값 조회
        int minWithoutPush = Collections.min(myPriorityQueueWithElements);
        System.out.println(minWithoutPush);

        System.out.println("순회");
        // 우선순위 큐 순회(iteration)
        for (int element : myPriorityQueueWithElements) {
            System.out.println(element);
        }
    }
}
