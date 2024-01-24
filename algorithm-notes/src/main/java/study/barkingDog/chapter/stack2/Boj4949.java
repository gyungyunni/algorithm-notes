package study.barkingDog.chapter.stack2;

import java.io.*;
import java.util.*;
public class Boj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        String s;
        while (true) {
            s = br.readLine();
            if (s.equals(".")) {    // 종료 조건문
                break;
            }
            int cnt =0;
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    // 스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우
                    if (stack.empty() || stack.peek() != '(') {
                        answer.append("no");
                        cnt ++;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    // 스택이 비어있거나 pop할 원소가 대괄호랑 매칭이 안되는 경우
                    if (stack.empty() || stack.peek() != '[') {
                        answer.append("no");
                        cnt ++;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(cnt == 0 && stack.empty()) {
                answer.append("yes");
            }
            if(cnt == 0 && !stack.empty()) {
                answer.append("no");
            }
            answer.append("\n");

        }
        System.out.println(answer);
    }
}

