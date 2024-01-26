package study.barkingDog.chapter.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj2178 {
    // 상, 하, 좌, 우 탐색을 위한 방향 벡터
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void bfs(int x, int y, boolean[][] visited, int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        // 현재 위치를 방문했다고 표시
        visited[x][y] = true;
        int n = grid.length;
        int m = grid[0].length;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            x = current[0];
            y = current[1];

            // 현재 위치에서 인접한 위치 탐색
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                // 1. 범위 이내에 있는가
                if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;   // 범위에서 나가면 제끼기
                // 2. 막힌 길인가
                if (grid[nx][ny] == 0)
                    continue;   // 막힌 길이면 제끼기
                // 3. 이미 방문 했나
                if (visited[nx][ny])
                    continue;   // 방문했으면(true 이면) 제끼기
                // 모든 조건에 해당되지 않음. 즉, 갈 수 있는 길 이면 queue 에 삽입해주고 방문처리.
                queue.offer(new int[]{nx, ny});
                visited[nx][ny] = true;

                // 그리고 최소 칸의 수를 구해야되므로 해당하는 칸에 1씩 누적해서 적어줌
                // 도착 칸이면 그 값이 지나야 하는 최소 칸의 수.
                grid[nx][ny] = grid[x][y] + 1;
            }
        }
        System.out.println(grid[n-1][m - 1]);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n,m을 입력받고  2차원배열, visit (방문 여부)을 생성해준다.
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(values[j]);
            }
        }

        // 방문 정보
        boolean[][] visited = new boolean[grid.length][grid[0].length]; //grid의 행열 넣은거임


        bfs(0,0, visited, grid);
    }
}