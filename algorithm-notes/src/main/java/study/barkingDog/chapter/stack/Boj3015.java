package study.barkingDog.chapter.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 못풀었음
public class Boj3015 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(br.readLine());
            int cnt = 1;

            while (!stack.isEmpty() && stack.peek()[0] <= height) {
                answer += stack.peek()[1];
                if (stack.peek()[0] == height) {
                    cnt += stack.peek()[1];
                }
                stack.pop();

            }

            if (!stack.isEmpty()) {
                cnt++;
            }

            stack.push(new int[]{height, cnt});
        }

        System.out.println(answer);
    }
}