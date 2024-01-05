package algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

// 프림(Prim) 알고리즘은 주어진 연결 그래프에서 최소 신장 트리를 찾는 알고리즘입니다.
// 최소 신장 트리는 그래프의 모든 정점을 연결하는 간선의 가중치 합이 최소인 트리를 의미합니다.
public class Prim {

    public static int prim(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n]; // 방문한 정점 표시
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])); // (가중치, 정점)
        int result = 0;

        queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int weight = current[0];
            int node = current[1];

            // 이미 방문한 정점이라면 무시
            if (visited[node]) {
                continue;
            }

            // 정점을 방문하고 결과에 가중치 추가
            visited[node] = true;
            result += weight;

            // 현재 정점과 연결된 인접 정점 확인
            for (int adjacent = 0; adjacent < n; adjacent++) {
                int adjWeight = graph[node][adjacent];
                if (!visited[adjacent] && adjWeight != 0) {
                    queue.offer(new int[]{adjWeight, adjacent});
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // 그래프 예시 (2차원 배열로 표현)
        int[][] graph = {
                {0, 29, 0, 0, 10},
                {29, 0, 16, 0, 0},
                {0, 16, 0, 12, 0},
                {0, 0, 12, 0, 18},
                {10, 0, 0, 18, 0}
        };

        // 최소 신장 트리의 가중치 합
        int mstWeight = prim(graph);
        System.out.println(mstWeight); // output: 56
    }
}