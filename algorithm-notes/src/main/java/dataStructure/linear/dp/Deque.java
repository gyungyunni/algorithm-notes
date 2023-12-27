package dataStructure.linear.dp;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

// 데크는 Double Ended Queue로 스택과 큐의 장점을 빼서 구성된 자료구조
// 입력, 삭제가 양쪽 끝에서 모두 발생할 수 있는 자료 구조
public class Deque {
        public static void main(String[] args) {
            // 빈 덱 생성
            ArrayDeque<Integer> myDeque = new ArrayDeque<>();

            // 원소를 포함한 덱 생성
            ArrayDeque<Integer> myDequeWithElements = new ArrayDeque<>(List.of(1, 2, 3, 4, 5));

            // 덱의 길이(크기) 확인
            int dequeSize = myDequeWithElements.size();

            // 덱의 앞쪽에 원소 추가
            myDeque.addFirst(0);

            // 덱의 뒤쪽에 원소 추가
            myDeque.addLast(6);

            // 덱의 앞쪽 원소 추출
            int frontElement = myDeque.pollFirst(); // or myDeque.removeFirst()

            // 덱의 뒤쪽 원소 추출
            int rearElement = myDeque.pollLast(); // or myDeque.removeLast()

            // 덱 순회(iteration)
            Iterator<Integer> iterator = myDequeWithElements.iterator();
            while (iterator.hasNext()) {
                int element = iterator.next();
                System.out.println(element);
            }

            // 덱의 특정 원소 인덱스 찾기
            // 특정 요소의 인덱스를 찾기 위해 수동 반복을 추가
            // 인덱스 기반 액세스가 자주 필요한 경우 ArrayList가 나음
            int elementToFind = 3;
            int index = 0;
            for (int element : myDequeWithElements) {
                if (element == elementToFind) {
                    break;
                }
                index++;
            }

            System.out.println("Index of " + elementToFind + ": " + index);
        }
}
