package study.barkingDog.chapter.stack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String s;
        for (int i = 0; i < n; i++) {

            s = br.readLine();

            int cnt = 0;
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    // 스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우
                    if (stack.empty() || stack.peek() != '(') {
                        answer.append("NO");
                        cnt++;
                        break;
                    } else {
                        stack.pop();
                    }
                }

            }
            if (cnt == 0 && stack.empty()) {
                answer.append("YES");
            }
            if (cnt == 0 && !stack.empty()) {
                answer.append("NO");
            }
            answer.append("\n");

        }
        System.out.println(answer);
    }
}
