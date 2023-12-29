package dataStructure.linear.sq;

import java.util.Arrays;
import java.util.Stack;

// 스택은 후입선출, DFS에서 활용, 웹 브라우저 방문기록
public class MyStack {
    public static void main(String[] args) {
        // 빈 스택 생성
        Stack<Integer> myStack = new Stack<>();

        // 원소를 포함한 스택 생성
        Stack<Integer> myStackWithElements = new Stack<>();
        myStackWithElements.push(1);
        myStackWithElements.push(2);
        myStackWithElements.push(3);
        myStackWithElements.push(4);
        myStackWithElements.push(5);

//        myStackWithElements.addAll(Arrays.asList(1, 2, 3, 4, 5));

        // 스택에 원소 추가
        myStack.push(6);
        myStack.push(7);

        // 스택에서 원소 추출
        int poppedElement = myStack.pop();

        // 스택의 가장 위의 원소 조회 (제거하지 않고)
        int peekElement = myStack.peek();

        // 스택이 비어있는지 확인
        boolean isEmpty = myStack.isEmpty();

        // 스택 순회(iteration)
        for (int element : myStackWithElements) {
            System.out.println(element);
        }
        // 스택 순회(iteration)
        for (int element : myStack) {
            System.out.println(element);
        }
    }
}