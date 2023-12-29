package dataStructure.nonlinear.graph.shortestpath;

import java.util.*;

class Graph {
    private Set<String> nodes;
    private Map<String, List<Neighbor>> edges;

    // 노드에 'HashSet'을 사용하면 노드 관련 작업의 고유성과 빠른 작업이 보장됨
    // 엣지에 'HashMap'을 사용하면 엣지 측면에서 노드 간의 관계를 효율적으로 검색하고 관리할 수 있음
    public Graph() {
        this.nodes = new HashSet<>();
        this.edges = new HashMap<>();
    }

    public void addNode(String value) {
        nodes.add(value);
        edges.put(value, new ArrayList<>());
    }

    public void addEdge(String fromNode, String toNode, int weight) {
        edges.get(fromNode).add(new Neighbor(toNode, weight));
        edges.get(toNode).add(new Neighbor(fromNode, weight)); // Add this line for bidirectional graph
    }

    public Map<String, Integer> dijkstra(String start) {
        // Map<String, Integer> distances: 이 맵은 시작 노드에서 다른 모든 노드까지의 최단 거리를 저장하는 데 사용됩니다.
        // Integer.MAX_VALUE0으로 설정된 시작 노드를 제외한 모든 거리는 으로 초기화됩니다.

        Map<String, Integer> distances = new HashMap<>();
        for (String node : nodes) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        // PriorityQueue<NodeDistance> priorityQueue: 이 우선순위 큐는 노드와 노드의 거리를 오름차순으로 추적하는 데 사용됩니다.
        // 거리가 더 작은 노드의 우선순위가 더 높습니다.
        PriorityQueue<NodeDistance> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(nd -> nd.distance));
        priorityQueue.add(new NodeDistance(start, 0));

        while (!priorityQueue.isEmpty()) {
            NodeDistance current = priorityQueue.poll(); // 우선순위 큐로부터 거리가 가장 작은 노드를 제거하고 가져옵니다.
            String currentNode = current.node; // 현재 노드와 그 거리를 추출합니다.
            int currentDistance = current.distance;

            // 현재 거리가 지도에 저장된 거리보다 크면 distances현재 반복을 건너뜁니다. 이는 오래된 정보를 처리하지 않도록 하기 위한 것입니다.
            if (currentDistance > distances.get(currentNode)) {
                continue;
            }

            // 현재 노드의 이웃을 반복합니다.
            // 이웃( distance = currentDistance + neighbor.weight)까지 도달하기 위한 총 거리를 계산합니다.
            // distances계산된 거리가 지도에 저장된 이웃의 거리보다 작은 경우 - 지도 에서 거리를 업데이트하세요 distances. 이웃과 업데이트된 거리를 우선순위 대기열에 추가합니다.
            for (Neighbor neighbor : edges.get(currentNode)) {
                String nextNode = neighbor.node;
                int distance = currentDistance + neighbor.weight;

                if (distance < distances.get(nextNode)) {
                    distances.put(nextNode, distance);
                    priorityQueue.add(new NodeDistance(nextNode, distance));
                }
            }
        }

        return distances;
    }

    private static class Neighbor {
        String node;
        int weight;

        public Neighbor(String node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    private static class NodeDistance {
        String node;
        int distance;

        public NodeDistance(String node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
}

public class ShortestPath {
    public static void main(String[] args) {
        // 그래프 생성
        Graph myGraph = new Graph();
        myGraph.addNode("A");
        myGraph.addNode("B");
        myGraph.addNode("C");
        myGraph.addNode("D");
        myGraph.addNode("E");

        myGraph.addEdge("A", "B", 5);
        myGraph.addEdge("B", "C", 3);
        myGraph.addEdge("C", "D", 1);
        myGraph.addEdge("D", "E", 2);
        myGraph.addEdge("A", "E", 8);

        // 최단 경로 계산
        String startNode = "A";
        Map<String, Integer> shortestDistances = myGraph.dijkstra(startNode);

        // 결과 출력
        for (Map.Entry<String, Integer> entry : shortestDistances.entrySet()) {
            System.out.printf("Shortest distance from %s to %s: %d%n", startNode, entry.getKey(), entry.getValue());
        }
    }
}