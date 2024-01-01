package dataStructure.nonlinear.graph.tree.heap;

import java.util.PriorityQueue;

// 힙은 힙 속성을 만족하는 특수한 트리 기반 데이터 구조. 힙은 기본적으로 노드가 왼쪽부터 채워지는 완전 이진 트리 형
// 힙 속성은 최소 힙인지 최대 힙인지에 따라 달라짐
// 최소 힙 속성: 최소 힙에서 루트를 제외한 모든 노드 'i'에 대해 'i' 값은 상위 노드 값보다 크거나 같습니다. 이렇게 하면 최소 요소가 항상 루트에 있게 됨
// 최대 힙 속성: 최대 힙에서 루트를 제외한 모든 노드 'i'에 대해 'i' 값은 상위 노드 값보다 작거나 같습니다. 이렇게 하면 최대 요소가 항상 루트에 있게 됨
public class MinHeap {
    private PriorityQueue<Integer> heap;

    public MinHeap() {
        this.heap = new PriorityQueue<>();
    }

    public void insert(int value) {
        heap.offer(value);
    }

    public Integer extractMin() {
        return heap.poll();
    }

    public void display() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        // 최소 힙 생성
        MinHeap myHeap = new MinHeap();

        // 데이터 삽입
        myHeap.insert(5);
        myHeap.insert(3);
        myHeap.insert(8);
        myHeap.insert(1);
        myHeap.insert(10);

        // 힙 출력
        myHeap.display();

        // 최소값 추출
        Integer minValue = myHeap.extractMin();
        System.out.println("Extracted min value: " + minValue);

        // 힙 출력
        myHeap.display();
    }
}