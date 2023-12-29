package dataStructure.linear.l;

import java.util.LinkedList;

// 연결리스트. 자료를 임의의 공간에 기억시키고, 각 노드의 포인터 부분을 이용해서 서로 연결한 형태
// 자료의 삽입 및 삭제가 용이, 희소행렬(행렬 요소가 0이 많은 경우)을 표현할 때 기억장소 이용효울이 좋다
// 선형리스트에 비해 느림, 포인터를 위한 추가 공간이 필요
public class MyLinkedList {
    public static void main(String[] args) {
        // 연결 리스트 생성
        LinkedList<Integer> myLinkedList = new LinkedList<>();

        // 노드 추가
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(4);

        // 연결 리스트 순회
        for (Integer value : myLinkedList) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}