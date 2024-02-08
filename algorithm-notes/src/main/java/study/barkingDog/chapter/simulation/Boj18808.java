package study.barkingDog.chapter.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj18808 {
    static int N, M, K = 0;
    static int ans = 0;
    static int[][] noteBook;

    static void search(int[][] sticker) {
        int r = sticker.length; // 행 수, 세로
        int c = sticker[0].length; // 열 수, 가로

        for (int d = 0; d < 4; d++) {
            if (d != 0)  //처음엔 안돌리고
                sticker = rotate(sticker, r, c);
            r = sticker.length;
            c = sticker[0].length;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (i + r > N || j + c > M)  // 노트북 벗어나면 break;
                        break;
                    if (attach(i, j, r, c, sticker)) {
                        return;
                    }
                }
            }
        }

    }

    static boolean attach(int x, int y, int w, int z, int[][] sticker) {

        for (int i = x; i < x + w; i++) {
            for (int j = y; j < y + z; j++) {
                if (noteBook[i][j] == 1 && sticker[i - x][j - y] == 1) { //노트북에 이미 1이 붙여져 있고 스티커도 1이면
                    return false;
                }
            }
        }
        for (int i = x; i < x + w; i++) { //스티커 모양
            for (int j = y; j < y + z; j++) {
                if (sticker[i - x][j - y] == 1) { // 스티커만 1이면
                    noteBook[i][j] = 1;  // 스티커 붙이기
                    ans++;
                }
            }
        }
        return true;
    }

    static int[][] rotate(int[][] sticker, int r, int c) { // 시계방향으로 90도 회전. 행과 열을 바꾸고 역순으로 배치
        int[][] newSticker = new int[c][r];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                newSticker[j][r - i - 1] = sticker[i][j];

        return newSticker;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        noteBook = new int[N][M];

        for (int k = 0; k < K; k++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int[][] sticker = new int[r][c];

            for (int i = 0; i < r; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < c; j++) {
                    sticker[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            search(sticker);
        }
        System.out.println(ans);
    }
}
