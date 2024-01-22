package study.barkingDog.chapter.linkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.add(i); // 1 2 3 4 5 6 7 선입선출
        System.out.print('<');
        while (!Q.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                Q.add(Q.poll()); // 원소 추출하고 삭제 후 큐에 다시 추가,
            }
            System.out.print(Q.poll());
            if (!Q.isEmpty()) System.out.print(", ");
        }
        System.out.println('>');
    }
}