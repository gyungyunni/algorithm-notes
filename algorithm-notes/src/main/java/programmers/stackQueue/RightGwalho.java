package programmers.stackQueue;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class RightGwalho {
    boolean solution(String s) {
        boolean answer = true;
        Character[] str = new Character[s.length()];
        int j = 0;
        for (Character c : s.toCharArray()) {
            str[j] = c;
            j++;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i] == '('){
                stack.push(str[i]);
            }
            else if(!stack.isEmpty() && str[i] == ')') {
                stack.pop();
            }
            else if(stack.isEmpty() && str[i] == ')') {
                answer = false;
                break;
            }
        }
        if(!stack.isEmpty())
            answer = false;
        return answer;
    }
    public static void main(String[] args) {
        RightGwalho pro = new RightGwalho();
        String s = "(()(";
        System.out.println(pro.solution(s));
    }
}
