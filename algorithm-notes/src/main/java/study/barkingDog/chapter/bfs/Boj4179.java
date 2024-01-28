package study.barkingDog.chapter.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
이 문제는 불에 대한 BFS와 지훈이에 대한 BFS를 모두 돌림으로서 해결이 가능하다.
지훈이의 이동이 불의 전파에 영향을 받지만, 불의 전파는 지훈이의 이동에 영향을 받지 않기 때문에 불만 먼저 전파를 쭉 시킨다.
불에 대한 BFS를 돌려서 미리 각 칸에 불이 전파되는 시간을 다 구해둔다.

그 다음에는 지훈이에 대한 BFS를 돌려서 지훈이를 이동시킨다.

지훈이의 이동은 불의 전파에 영향을 받기 때문에 BFS를 돌릴 때 조건문을 조금 수정해줄 필요가 있다.

1. 지훈이보다 먼저 불이 도달한 공간에는 방문할 수 없게 처리한다.
= 불이 특정 공간에 도달하는 시간 <= 지훈이가 특정 공간에 도달하는 시간
2. 지훈이가 배열의 범위를 벗어났을 경우, 탈출 성공하게 처리한다.
지훈이가 한번이라도 배열의 범위를 벗어나지 못했을 경우, 탈출에 실패했다는 의미이므로 IMPOSSIBLE을 출력한다.
 */
public class Boj4179 {
    // 상, 하, 좌, 우 탐색을 위한 방향 벡터
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] dist1; // 불의 전파 시간
    static int[][] dist2; // 지훈이의 이동 시간
    static Queue<int[]> Q1;
    static Queue<int[]> Q2;
    static void bfs( Character[][] grid, Queue<int[]> Q1, Queue<int[]> Q2, int[][] dist1, int[][] dist2) {
        int n = grid.length;
        int m = grid[0].length;

        // 불에 대한 BFS
        while (!Q1.isEmpty()) {
            int[] current = Q1.poll();
            int x = current[0];
            int y = current[1];
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (dist1[nx][ny] >= 0 || grid[nx][ny] == '#') continue; // 벽은 못 통과
                dist1[nx][ny] = dist1[x][y] + 1;
                Q1.offer(new int[]{nx, ny});
            }
        }

        // 지훈이에 대한 BFS
        while (!Q2.isEmpty()) {
            int[] current = Q2.poll();
            int x = current[0];
            int y = current[1];
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                // 범위를 벗어났다는 것은 탈출에 성공했다는 의미. 큐에 거리 순으로 들어가므로 최초에 탈출한 시간을 출력하면 됨.
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    System.out.println(dist2[x][y] + 1);
                    return;
                }
                if(dist2[nx][ny] >= 0 || grid[nx][ny] == '#') continue;
                // 불의 전파 시간을 조건에 추가
                if(dist1[nx][ny] != -1 && dist1[nx][ny] <= dist2[x][y]+1) continue; // 불의 전파 시간을 조건에 추가
                dist2[nx][ny] = dist2[x][y] + 1;
                Q2.offer(new int[]{nx, ny});
            }
        }

        System.out.println("IMPOSSIBLE"); // 여기에 도달했다는 것은 탈출에 실패했음을 의미.
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        dist1 = new int[R][C]; // 불의 전파 시간
        dist2 = new int[R][C]; // 지훈이의 이동 시간

        Q1 =  new LinkedList<>();
        Q2 =  new LinkedList<>();

        Character[][] grid = new Character[R][C];
        // 배열 초기화
        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                grid[i][j] = s.charAt(j);
                dist1[i][j] = -1;
                dist2[i][j] = -1;
                if (grid[i][j] == 'F') {
                    Q1.offer(new int[]{i, j});
                    dist1[i][j] = 0;
                }
                if (grid[i][j] == 'J') {
                    Q2.offer(new int[]{i, j});
                    dist2[i][j] = 0;
                }
            }
        }


        bfs(grid, Q1, Q2, dist1, dist2);
    }
}