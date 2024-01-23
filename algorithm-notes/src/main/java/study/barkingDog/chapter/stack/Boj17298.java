package study.barkingDog.chapter.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 7 answer[3] = -1, stack : 7
        // 2 answer[2] = 7, stack : 7 2
        // 5 2<=5 이므로, stack : 7 5 answer[1] = 7
        // 1 answer[i] = 5 stack : 7 5 1
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();
            }
            stack.push(array[i]);
        }

        for (int i = 0; i < n; i++) {
            ans.append(answer[i]).append(" ");
        }

        System.out.println(ans.toString());
    }
}