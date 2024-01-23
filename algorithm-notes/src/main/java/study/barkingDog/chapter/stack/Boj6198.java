package study.barkingDog.chapter.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj6198 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long ans = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(br.readLine());

            // i번째 빌딩의 높이 h(i)를 기준으로 이전 빌딩들 중, i번째 빌딩의 높이 h(i)보다 낮은 빌딩은 체크할 필요가 없다
            while (!stack.isEmpty() && stack.peek() <= height) {
                stack.pop();
            }
            // 10 3 7 4 12 2
            // 10  ans = 0
            // 10 3  ans = 1
            // 10 7  ans = 2
            // 10 7 4 ans = 4
            // 12 ans = 4
            // 12 ans = 5
            ans += stack.size(); // 어떤 빌딩들을 관찰이 가능할지 stack에 값을 저장해주게 되고, 그 때 stack에 저장되어 있던 순간의 합이 각 빌딩에서 관찰 가능한 빌딩들의 개수

            stack.push(height);
        }

        System.out.println(ans);
    }
}