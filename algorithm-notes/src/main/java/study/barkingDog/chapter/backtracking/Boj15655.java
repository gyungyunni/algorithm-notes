package study.barkingDog.chapter.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj15655 {
    static int n, m;
    static ArrayList<Integer> num = new ArrayList<>();
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];
    static StringBuilder sb = new StringBuilder();

    public static void func(int k) {
        if (k == m) {
            for (int i = 0; i < m; i++)
                sb.append(num.get(arr[i])).append(" "); // arr에 기록해둔 인덱스에 대응되는 수를 출력
            sb.append("\n");
            return;
        }

        int st = 0; // 시작지점, k = 0일 때에는 st = 0
        if(k != 0) st = arr[k-1] + 1; // k != 0일 경우 st = arr[k-1]+1
        for(int i = st; i < n; i++){
            if(!isUsed[i]){ // 아직 i가 사용되지 않았으면
                arr[k] = i; // k번째 인덱스를 i로 정함
                isUsed[i] = true; // i를 사용되었다고 표시
                func(k+1); // 다음 인덱스를 정하러 한 단계 더 들어감
                isUsed[i] = false; // k번째 인덱스를 i로 정한 모든 경우에 대해 다 확인했으니 i를 이제 사용되지않았다고 명시함.
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(num);
        func(0);
        System.out.println(sb);
    }
}