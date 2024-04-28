package programmers.stackQueue;

// https://school.programmers.co.kr/learn/courses/30/lessons/42583
import java.util.*;
public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        // bridge_length 만큼의 크기를 갖는 큐 생성
        Queue<Integer> bridge = new LinkedList<>();
        // 맨 처음 비어있는 다리 공간 모두를 0으로 초기화
        for(int i = 0; i < bridge_length; i++){
            bridge.add(0);
        }

        // 다리 길이가 1이거나 트럭의 개수가 1일 경우
        if(bridge_length == 1)
            return truck_weights.length+1;
        if(truck_weights.length == 1)
            return bridge_length+1;

        int idx = 0;
        // 현재 다리에 있는 모든 트럭의 무게
        int curWeight = 0;
        // 트럭의 개수만큼 계속 반복
        while(idx < truck_weights.length) {
            // 현재 다리에 존재하는 맨 앞 트럭의 무게를 빼준다
            curWeight -= bridge.poll();
            answer++;  // 새로운 트럭 넣기

            // 현재 다리에 있는 트럭 무게와 들어올 트럭 무게 합과 weight 비교
            if(curWeight + truck_weights[idx] <= weight) {
                bridge.add(truck_weights[idx]);
                curWeight += truck_weights[idx++];
            }
            // 견딜 수 있는 무게보다 커지면 0을 넣는다(다리를 지날 때까지 쉬어가는)
            else bridge.add(0);
        }

        // 마지막 트럭까지 다리를 건너는 값을 구하기 위해 + bridge_length
        return answer + bridge_length;
    }
    public static void main(String[] args) {
        Truck pro = new Truck();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        System.out.println(pro.solution(bridge_length, weight, truck_weights));
    }
}
