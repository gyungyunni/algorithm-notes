package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

//Bfs에서 구현할때  실수하는 경우
//1. 시작점을 큐에 넣긴 하는데 방문했다는 표시를 남기지 않는다 -> 시작점을 두번 방문할 수 있음
//2. 큐에 넣을 때 방문했다는 표시를 하는 대신 큐에서 빼낼 때 방문했다는 표시를 남겼다 -> 같은 칸이 큐에 여러번 들어가게 되어서 시간초과나 메모리초과 발생
//3. 이웃한 원소(nx, ny)가 범위를 벗어났는지에 대한 체크를 잘못함
public class Bfs {
    // 상, 하, 좌, 우 탐색을 위한 방향 벡터
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void bfs(int x, int y, boolean[][] visited, int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        // 현재 위치를 방문했다고 표시
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            x = current[0];
            y = current[1];
            System.out.println("Visit location: (" + x + ", " + y + ")");

            // 현재 위치에서 인접한 위치 탐색
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                // 배열 범위 안에 있고 방문하지 않았다면 큐에 넣고 탐색
                if (0 <= nx && nx < grid.length && 0 <= ny && ny < grid[0].length && !visited[nx][ny] && grid[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 2차원 배열 예제 (1은 갈 수 있는 경로, 0은 갈 수 없는 경로)
        int[][] grid = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
        };

        // 방문 정보, grid의 행열 넣은거임
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        // 예시로 (0, 0)부터 탐색 시작
        bfs(0, 0, visited, grid);
    }
}