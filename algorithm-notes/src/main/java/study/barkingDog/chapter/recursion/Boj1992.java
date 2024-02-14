package study.barkingDog.chapter.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1992 {
    static int N;
    public static String[][] board;
    static StringBuilder sb = new StringBuilder();
    private static void quadTree(int r, int c, int size) {

        if(check(r, c, size)) {
            sb.append(board[r][c]);
            return;
        }
        int newSize = size/2;
        sb.append("(");
        quadTree(r, c, newSize);//왼쪽위
        quadTree(r, c+newSize, newSize);//오른쪽 위
        quadTree(r+newSize, c, newSize);//왼쪽 아래
        quadTree(r+newSize, c+newSize, newSize);//오른쪽 아래
        sb.append(")");
    }

    private static boolean check(int r, int c, int size) {
        for (int i = r; i < r+size; i++) {
            for (int j = c; j < c+size; j++) {
                if(!board[i][j].equals(board[r][c]))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        board = new String[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            board[i] = s.split("");
        }
        quadTree(0, 0, N);
        System.out.println(sb.toString());
    }
}
