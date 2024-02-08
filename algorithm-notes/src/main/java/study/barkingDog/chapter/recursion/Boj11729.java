package study.barkingDog.chapter.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n-1 개의 원판을 원하는 곳으로 옮길 수만 있다면 n개의 원판을 처리할 수 있음
// from(1), to(3), other(2) 번 기둥이 있을 때
// n-1개의 원판을 기둥 from에서 기둥 other로 옮긴다.
// n번 원판을 기둥 from에서 기둥 to로 옮긴다
// n-1개의 원판을 기둥 other에서 기둥 to로 옮긴다.
public class Boj11729 {

    public static StringBuilder sb = new StringBuilder();
    static int count = 0;
    public static void hanoi(int n, int from, int to, int other) {  // 3 1 3 2
        if (n == 0)
            return;
        else {
            count++;
            hanoi(n - 1, from, other, to); // n-1개의 원판을 기둥 from에서 기둥 other로 옮긴다.
            sb.append(from + " " + to + "\n"); // n번 원판을 기둥 from에서 기둥 to로 옮긴다
            hanoi(n - 1, other, to, from); //  n-1개의 원판을 기둥 other에서 기둥 to로 옮긴다.

        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        hanoi(n, 1, 3, 2);

        System.out.println(count);
        System.out.println(sb);
    }

}
