package study.barkingDog.chapter.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//첫번째 행 첫번쨰 열에 퀸이 있다고 할 때, 두번째 행 첫번째 열에 퀸이 오면 아래에 어디에 배치되든 조건을 만족하지 못하게 된다.
//따라서, 애초에 첫번째 행, 열에 퀸이 있다면, 두번째 행에서는 1,2 번쨰 열에 퀸이 오는 것은 탐색을
//시도조차 못하게 해야 한다. 따라서 valid check로 possible이 false인 경우는 제외해줘야 한다.
public class Boj9663 {

    static int N, ans;
    static int[] col;

    static boolean attackable(int r1, int c1, int r2, int c2) {
        if (c1 == c2) return true;   // 열이 같다면
        if (r1 - c1 == r2 - c2) return true; // 대각선인데 퀸 기준 오른쪽 아래
        if (r1 + c1 == r2 + c2) return true; // 대각선인데 퀸 기준 왼쪽 아래
        return false;
    }

    static void func(int row) {
        if (row == N + 1) {
            ans++;
        } else {
            for (int c = 1; c <= N; c++) {
                boolean possible = true;

                for (int i=1;i<=row-1;i++){
                    if (attackable(row, c, i, col[i])){
                        possible = false;
                        break;
                    }
                }
                if (possible) {
                    col[row] = c;
                    func(row + 1);
                    col[row] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col = new int[N + 1];
        func(1);
        System.out.println(ans);
    }
}
