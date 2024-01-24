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

        // 4
        // 5,4,1,7라 하면 순서쌍은 (5,4), (4,1), (1,7), (5,7), (4,7) 5개
        // 처음 5 입력되면 스택 비어있는 상태이므로 스택에 (5, 1) 저장
        // 그다음 4 입력들어오면 stack.peek()[0] <= height 만족하지 않으므로 패스
        // (!stack.isEmpty()) 만족하므로 스택에 (4,2) 추가. 현재 (5,1) (4,2) 스택에 들어있음
        // 입력값 1 들어오면 stack.peek()[0] <= height 만족하지 않으므로 마찬가지로 스택에 (1,3) 추가. (5,1), (4,2),(1, 2) 스택에 들어있음
        // 입력값 7 들어오면 stack.peek()[0] <= height 만족하므로 answer에 +2
        // 그리고 pop() 하면 (5,1) (4,2) 남고, 현재 h = 7이어서 조건 만족하므로 루프 돌면 answer +2 = 4
        // pop() (5,1) answer +1 = 6
        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(br.readLine());
            int cnt = 1;

            while (!stack.isEmpty() && stack.peek()[0] <= height) {
                answer += stack.peek()[1];
                if (stack.peek()[0] == height) {
                    cnt += stack.peek()[1];  // 같은 키의 사람이 몇 번 등장했는지도 추가
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