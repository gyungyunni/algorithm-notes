package study.barkingDog.chapter.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj1697 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] dist = new int[100002]; //  N(0 ≤ N ≤ 100,000) 이므로
        Arrays.fill(dist, -1);
        dist[N] = 0;
        Queue<Integer> Q = new LinkedList<>();
        Q.add(N); //처음에 5

        while (dist[K] == -1) {
            int cur = Q.poll();    // 처음에 5
            for (int nxt : new int[]{cur - 1, cur + 1, 2 * cur}) {
                if (nxt < 0 || nxt > 100000) continue; // 범위 넘어가면 패스
                if (dist[nxt] != -1) continue;
                dist[nxt] = dist[cur] + 1;  // dist[nxt] 이 -1일때만
                Q.add(nxt);
            }
        }

        System.out.println(dist[K]); // 여기에 써져 있는 값이 이동한 횟수
    }
}