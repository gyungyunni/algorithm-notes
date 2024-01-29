package study.barkingDog.chapter.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1012 {
    static int M, N, K;
    static int[][] cabbage;
    static boolean[][] visit;
    static int count;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    static void bfs(int x, int y) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[] { x, y });

        while (!qu.isEmpty()) {
            int[] temp = qu.poll();
            x = temp[0];
            y = temp[1];
            visit[x][y] = true;

            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];

                if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                    if (!visit[cx][cy] && cabbage[cx][cy] == 1) {
                        qu.add(new int[] { cx, cy });
                        visit[cx][cy] = true;
                    }
                }

            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int c = 0; c < T; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            cabbage = new int[M][N]; // 배추 위치
            visit = new boolean[M][N];
            count=0;

            for (int i = 0; i < K; i++) {
                st=new StringTokenizer(br.readLine()," ");
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                cabbage[p1][p2] = 1;

            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (cabbage[i][j] == 1 && !visit[i][j]) { // 배추위치이면서 방문 안했으면
                        bfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }
}