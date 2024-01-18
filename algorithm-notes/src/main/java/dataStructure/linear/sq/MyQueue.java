package dataStructure.linear.sq;

import java.util.LinkedList;
import java.util.Queue;

// 큐는 선입선출, BFS에서 활용, 프로세스 관리
public class MyQueue {
    public static void main(String[] args) {
        // 빈 큐 생성
        Queue<Integer> myQueue = new LinkedList<>();

        // 원소를 포함한 큐 생성
        // offer를 써도 되는데 큐가 꽉 찼을 때, false를 반환
        Queue<Integer> myQueueWithElements = new LinkedList<>();
        myQueueWithElements.add(1);
        myQueueWithElements.add(2);
        myQueueWithElements.add(3);
        myQueueWithElements.add(4);
        myQueueWithElements.add(5);

        // 큐에 원소 추가
        myQueue.add(6);
        myQueue.add(7);

        // 큐에서 원소 추출, poll/remove
        int poppedElement = myQueue.poll();

        // 큐의 가장 앞의 원소 조회 (제거하지 않고), element/peek
        int peekElement = myQueue.peek();

        // 큐가 비어있는지 확인
        boolean isEmpty = myQueue.isEmpty();

        // 큐 순회(iteration)
        for (int element : myQueueWithElements) {
            System.out.println(element);
        }
    }
}