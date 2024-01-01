package dataStructure.nonlinear.graph.tree.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    private PriorityQueue<Integer> heap;

    public MaxHeap() {
        this.heap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void insert(int value) {
        heap.offer(value);
    }

    public Integer extractMax() {
        return heap.poll();
    }

    public void display() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        // 최소 힙 생성
        MaxHeap myHeap = new MaxHeap();

        // 데이터 삽입
        myHeap.insert(5);
        myHeap.insert(3);
        myHeap.insert(8);
        myHeap.insert(1);
        myHeap.insert(10);

        // 힙 출력
        myHeap.display();

        // 최대값 추출
        Integer maxValue = myHeap.extractMax();
        System.out.println("Extracted max value: " + maxValue);

        // 힙 출력
        myHeap.display();
    }
}