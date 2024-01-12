package programmers.lv0_1;

import java.util.*;

public class Pro43 {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
            }
        }
        return stack;
    }

    public static void main(String[] args){
        Pro43 pro43 = new Pro43();
        int[] arr = {1,4,2,5,3};
        System.out.println(pro43.solution(arr));
    }
}
