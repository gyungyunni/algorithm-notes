package study.barkingDog.chapter.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15650 {
    static int n, m;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];  // 특정 수가 쓰였는지 나타내는 배열

    public static void func(int k) { // 현재 k개까지 수를 택했음
        if (k == m) {  // m개를 모두 택했으면
            for (int i = 0; i < m; i++)
                System.out.print(arr[i] + " "); // arr에 기록해둔 수를 출력
            System.out.println();
            return;
        }

        int st = 1; // 시작지점, k = 0일 때에는 st = 1
        if(k != 0) st = arr[k-1] + 1; // k != 0일 경우 st = arr[k-1]+1

        for (int i = st; i <= n; i++) { // st부터 n까지의 수에 대해
            if (!isUsed[i]) {  // 아직 i가 사용되지 않았으면
                arr[k] = i;  // k번째 수를 i로 정함
                isUsed[i] = true;  // i를 사용되었다고 표시
                func(k + 1); // 다음 수를 정하러 한 단계 더 들어감
                isUsed[i] = false; // k번째 수를 i로 정한 모든 경우에 대해 다 확인했으니 i를 이제 사용되지않았다고 명시함.
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        func(0);
    }
}