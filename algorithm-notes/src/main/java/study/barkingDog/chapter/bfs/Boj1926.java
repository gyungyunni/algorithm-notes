package study.barkingDog.chapter.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj1926 {
    // 상, 하, 좌, 우 탐색을 위한 방향 벡터
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    //출발점 모를때
    static void bfs(boolean[][] visited, int[][] grid) {
        int cnt = 0;
        int max = 0;
        Queue<int[]> queue = new ArrayDeque<>();

        int n = grid.length;
        int m = grid[0].length;

        //한 점에서 출발하는 BFS가 아니라 출발점이 여러개가 될 수 있어서 이중포문으로 돌면서 탐색
        //하나의 포문이 시작되는 순간 그림의 개수는 한개가 증가 (cnt) 그 후에 해당 좌표 (0,0)을 방문여부 체크 해주고 q에 넣는다. 그후 q가 비어있지 않을동안 while돌며 탐색
        //제일먼저 들어간 큐의 값을 꺼내고 해당 x,y좌표를 가져온다.
        //네방향(dx,dy)을 다 돌며 방문했는지, 1(그림)인지 체크후 해당 좌표 true로 변경후, q에 삽입
        //제일 큰 그림의 크기도 구해야하니까 for문이 끝나기전 max값이랑 비교해 갱신
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0 || visited[i][j]) { // grid가 0 이거나 방문했던 곳이면
                    continue;
                }
                cnt++;
                visited[i][j] = true;
                queue.offer(new int[]{i, j});
                int area = 0;
                while(!queue.isEmpty()){
                    area++;
                    int[] temp = queue.poll();
                    int x = temp[0];
                    int y = temp[1];

                    for(int dir = 0;dir < 4; dir++){
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];
                        if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                        if(visited[nx][ny] || grid[nx][ny] !=1) continue;

                        // 나머지는 1인 부분
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx,ny});
                    }
                }
                max = Math.max(max,area);
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n,m을 입력받고  2차원배열, visit (방문 여부)을 생성해준다.
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(values[j]);
            }
        }

        // 방문 정보
        boolean[][] visited = new boolean[grid.length][grid[0].length]; //grid의 행열 넣은거임

        bfs(visited, grid);
    }
}