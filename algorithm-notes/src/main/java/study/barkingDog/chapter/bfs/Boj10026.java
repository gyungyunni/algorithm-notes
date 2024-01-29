package study.barkingDog.chapter.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;


public class Boj10026 {

    static char[][] grid;
    static boolean[][] vis;
    static int N;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static void bfs(int i, int j) {
        Queue<int[]> Q = new LinkedList<>();
        Q.add(new int[]{i, j});
        vis[i][j] = true;
        while (!Q.isEmpty()) {
            int[] current = Q.poll();
            int x = current[0];
            int y = current[1];
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                if (vis[nx][ny] || grid[i][j] != grid[nx][ny]) continue;
                vis[nx][ny] = true;
                Q.add(new int[]{nx, ny});
            }
        }
    }
    static int area() {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!vis[i][j]) {
                    cnt++;
                    bfs(i, j);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        grid = new char[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                {
                    grid[i][j] = s.charAt(j);
                }
            }
        }

        vis = new boolean[N][N];

        int notG = area();

        // 적록색약인 사람을 구하기위한 방문배열 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                vis[i][j] = false;
            }
        }

        // 적록색약은 초록과 빨강을 구분 못하므로 초록이면 빨강으로 바꿔줌
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 'G') {
                    grid[i][j] = 'R';
                }
            }
        }

        int isG = area(); //적록색약인 사람
        System.out.println(notG + " " + isG);

    }
}
