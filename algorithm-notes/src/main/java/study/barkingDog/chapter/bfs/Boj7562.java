package study.barkingDog.chapter.bfs;

import java.io.*;
import java.util.*;

public class Boj7562 {
    static int[][] dist;
    static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int t, n, x, y, xx, yy;
    static Queue<int[]> q;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트케이스 개수

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine()); // 체스판의 크기 n*n
            dist = new int[n][n];
            for (int k = 0; k < n; k++) {
                Arrays.fill(dist[k], -1);
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            dist[x][y] = 0;
            q = new LinkedList<>();
            q.add(new int[]{x, y});

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            xx = Integer.parseInt(st2.nextToken());
            yy = Integer.parseInt(st2.nextToken());

            while (!q.isEmpty()) {
                int[] current = q.poll();
                int x = current[0];
                int y = current[1];
                for (int dir = 0; dir < 8; dir++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];
                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                    if (dist[nx][ny] >= 0) continue;
                    dist[nx][ny] = dist[x][y] + 1;
                    q.add(new int[]{nx, ny});
                }
            }

            System.out.println(dist[xx][yy]);
        }
    }
}
