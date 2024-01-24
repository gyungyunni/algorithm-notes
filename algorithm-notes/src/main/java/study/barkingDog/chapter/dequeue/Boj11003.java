package study.barkingDog.chapter.dequeue;

import java.io.*;
import java.util.*;

public class Boj11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        StringBuilder answer = new StringBuilder();
        Deque<int[]> q = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 새로운 값이 안에 들어있는 값보다 크면 while문을 통해 바로 삭제해주고
            while(!q.isEmpty() && q.peekLast()[0] > num)
                q.pollLast();
            q.offer(new int[] {num,i});

            // 범위 지나는거 덱에서 제외. 그럼 덱에는 i -(l-1) ~ i 까지의 값들 들어있음
            if(q.peek()[1] < i -(l-1)) {
                q.poll();
            }
           // 그 구간에 속하는 최솟값을 출력
           answer.append(q.peek()[0] +" ");
        }
        System.out.println(answer);
    }
}