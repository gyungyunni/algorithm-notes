package study.barkingDog.chapter.stack;


import java.util.Scanner;
import java.util.Stack;

public class Boj1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Stack<Integer> S = new Stack<>();
        int cnt = 1;
        StringBuilder ans = new StringBuilder();

        while (n-- > 0) {
            int t = scanner.nextInt();
            while (cnt <= t) {  //  cnt가 t에 도달할 때까지 숫자를 스택에 푸시
                S.push(cnt++);
                ans.append("+\n");
            }
            if (!S.isEmpty() && S.peek() != t) { // 스택의 맨 위가 t와 같지 않으면 시퀀스가 불가능함을 의미하며 "NO"
                System.out.println("NO");
                return;
            }
            // 스택에서 최상위 요소를 pop 하고 "-"를 ans 문자열에 추가
            S.pop();
            ans.append("-\n");
        }
        System.out.println(ans);
    }
}