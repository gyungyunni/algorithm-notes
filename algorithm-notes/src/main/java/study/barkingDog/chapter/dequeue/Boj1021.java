package study.barkingDog.chapter.dequeue;

import java.io.IOException;
import java.util.*;

public class Boj1021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 1부터 N까지 덱에 담아둠
        for(int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        int answer =0;
        for(int i = 1; i <= M; i++) {
            int num = sc.nextInt(); // 찾으려는 원소

            int cnt = 0; // 연산횟수 초기화
            int index = 1;
            int l = deque.peekFirst();

            int elementToFind = num;
            for (int element : deque) {  // 인덱스 찾고
                if (element == elementToFind) {
                    break;
                }
                index++;
            }
            if ((num == l)) {
                deque.pollFirst();
            }
            if ((num != l)) {
                if (index <= (float) deque.size() / 2.0 + 1) {  // 찾으려는 원소 위치가 맨 앞이랑 가까운 경우, 2번연산
                    while (true) {
                        deque.addLast(deque.pollFirst());
                        cnt++;
                        l = deque.peekFirst();
                        if ((num == l)) { // 맨 앞으로 왔으면 1번 연산
                            deque.pollFirst();
                            break;
                        }
                    }
                } else {  // 찾으려는 원소 위치가 맨 끝이랑 가까운 경우, 3번연산
                    while (true) {
                        deque.addFirst(deque.pollLast());
                        cnt++;
                        l = deque.peekFirst();
                        if ((num == l)) { // 맨 뒤에서 앞으로 왔으면 1번 연산
                            deque.pollFirst();
                            break;
                        }
                    }
                }
                answer += cnt;
            }
        }
        System.out.println(answer);
    }
}
