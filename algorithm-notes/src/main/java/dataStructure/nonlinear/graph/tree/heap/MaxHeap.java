package dataStructure.nonlinear.graph.tree.heap;

import java.util.PriorityQueue;
import java.util.Collections;

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
        MaxHeap myMaxHeap = new MaxHeap();

        //데이터 삽입
        myMaxHeap.insert(5);
        myMaxHeap.insert(3);
        myMaxHeap.insert(8);
        myMaxHeap.insert(1);
        myMaxHeap.insert(10);

        // 힙 출력
        myMaxHeap.display();

        // 최소값 추출
        Integer maxValue = myMaxHeap.extractMax();
        System.out.println("Extracted max value: " + maxValue);

        // 힙 출력
        myMaxHeap.display();
    }
}