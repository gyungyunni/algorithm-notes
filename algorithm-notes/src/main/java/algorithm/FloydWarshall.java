package algorithm;

// 플루이드-워셜(Flloyd-Warshall) 알고리즘은 그래프의 모든 정점 쌍 간의 최단 거리를 찾는 알고리즘입니다.
// 이 알고리즘은 다이나믹 프로그래밍을 기반으로 하며, 3중 반복문을 사용하여 구현할 수 있습니다.
public class FloydWarshall {

    public static int[][] floydWarshall(int[][] graph) {
        int vertices = graph.length;
        int[][] distances = new int[vertices][vertices];

        // 거리 행렬 초기화 (자기 자신으로의 거리는 0, 나머지는 무한대)
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                distances[i][j] = (i != j) ? Integer.MAX_VALUE : 0;
            }
        }

        // 그래프의 간선 정보로 거리 행렬 초기화
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (graph[i][j] != 0) {
                    distances[i][j] = graph[i][j];
                }
            }
        }

        // 플루이드-워셜 알고리즘
        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    if (distances[i][k] != Integer.MAX_VALUE && distances[k][j] != Integer.MAX_VALUE) {
                        distances[i][j] = Math.min(distances[i][j], distances[i][k] + distances[k][j]);
                    }
                }
            }
        }

        return distances;
    }

    public static void main(String[] args) {
        // 그래프 예시 (2차원 배열로 표현, 0은 연결되지 않음)
        int[][] graph = {
                {0, 5, 0, 8},
                {7, 0, 9, 0},
                {2, 0, 0, 4},
                {0, 0, 3, 0}
        };

        // 모든 정점 쌍 간의 최단 거리
        int[][] shortestDistances = floydWarshall(graph);
        for (int i = 0; i < shortestDistances.length; i++) {
            for (int j = 0; j < shortestDistances[i].length; j++) {
                System.out.print(shortestDistances[i][j] + " ");
            }
            System.out.println();
        }
    }
}