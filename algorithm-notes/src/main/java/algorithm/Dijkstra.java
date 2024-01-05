package algorithm;

import java.util.*;

/*
# 다익스트라 알고리즘은 가중치가 있는 그래프에서 주어진 시작 정점에서
# 다른 모든 정점까지의 최단 거리를 찾는 알고리즘입니다.
 */
public class Dijkstra {

    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, String start) {
        Map<String, Integer> distances = new HashMap<>();
        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        queue.add(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            String currentVertex = currentNode.vertex;
            int currentDistance = currentNode.distance;

            // 이미 방문한 정점이라면 무시
            if (currentDistance > distances.get(currentVertex)) {
                continue;
            }

            // 현재 정점과 연결된 인접 정점 확인
            for (Map.Entry<String, Integer> entry : graph.get(currentVertex).entrySet()) {
                String adjacent = entry.getKey();
                int weight = entry.getValue();
                int distance = currentDistance + weight;

                // 최단 거리를 발견하면 업데이트하고 큐에 추가
                if (distance < distances.get(adjacent)) {
                    distances.put(adjacent, distance);
                    queue.add(new Node(adjacent, distance));
                }
            }
        }

        return distances;
    }

    public static void main(String[] args) {
        // 그래프 예시 (딕셔너리로 표현)
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        graph.put("A", Map.of("B", 8, "C", 1, "D", 2));
        graph.put("B", Collections.emptyMap());
        graph.put("C", Map.of("B", 5, "D", 2));
        graph.put("D", Map.of("E", 3, "F", 5));
        graph.put("E", Map.of("F", 1));
        graph.put("F", Map.of("A", 5));

        // 시작 정점 A로부터의 최단 거리
        Map<String, Integer> distances = dijkstra(graph, "A");
        System.out.println(distances); // Output: {A=0, B=6, C=1, D=2, E=5, F=6}
    }

    // Node 클래스는 이전 버전의 거리로 꼭짓점을 나타내는 데 사용됨
    static class Node {
        String vertex;
        int distance;

        Node(String vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }
}