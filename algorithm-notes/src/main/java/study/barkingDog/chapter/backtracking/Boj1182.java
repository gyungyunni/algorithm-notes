package study.barkingDog.chapter.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1182 {
    static int N, S;
    static int[] arr;
    static int cnt = 0;
    public static void func(int cur, int tot) {
        if (cur == N) {
            if(tot == S) cnt++;
            return;
        }

        func(cur+1, tot); // 현재 합계에 아무것도 추가하지 않고 다음 요소로 이동
        func(cur+1, tot+arr[cur]); // 현재 요소를 현재 합계에 추가한 후 다음 요소로 이동
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        func(0,0);
        if(S == 0) cnt--;
        System.out.println(cnt);
    }

}
