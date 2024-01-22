package study.barkingDog.chapter.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj13300 {
    public int solution(int N, int[][] arr, int X) {
        int answer = 0;
        for (int[] e: arr){
            for (int i = 0; i < e.length; i++) {
                answer += e[i]%X == 0 ? e[i]/X : e[i]/X + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Boj13300 boj13300 = new Boj13300();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] student = new int[2][7]; // 성별 , 학년

        int s , g;
        for(int i = 0 ; i < N ; i++) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            student[s][g]++;
        }
        System.out.println(boj13300.solution(N, student, K));
    }
}
