package study.barkingDog.studyTime.fifthWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj21608 {

    static int N;
    static int[][] board;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };
    static HashMap<String, Set<Integer>> stuPref = new HashMap<>();

    /**
     * student 번 학생의 자리를 찾는 메서드
     */
    public static void solution(String student) {
        int maxEmpty = 0; // 빈 인접 좌석의 최대 개수
        int maxLike = 0; // 좋아하는 학생의 최대 개수
        int x = 0; // x와 y는 현재 학생이 선택한 좌석의 좌표
        int y = 0;

        /*
        3. 2를 만족하는 칸도 여러 개인 경우에는 행의 번호가 가장 작은 칸으로, 그러한 칸도 여러 개이면 열의 번호가 가장 작은 칸으로 자리를 정한다.
        - 3번 조건을 만족 시키기위해 i,j가 0부터 탐색하는 것이 아닌 역순으로 탐색을 진행하여 앉을 자리 위치를 찾는다.
        즉, 오른쪽 아래부터 시작해서 왼쪽 위까지 탐색
         */
        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                if (board[i][j] != 0) { //이미 누군가 앉은 자리면 넘어간다. (i, j) 위치에 이미 학생이 앉아 있다면, 다음 좌석으로 건너뜀
                    continue;
                }

                //student를 (i,j)에 배치했을 때 빈칸 개수(empty), 좋아하는 학생 수(like)
                int empty = 0;
                int like = 0;

                /*
                각 방향에 대해 (nx, ny) 좌표의 이웃 좌석을 확인하고, 좌석이 비어 있으면 empty를 증가시킴
                비어 있지 않다면, 해당 좌석에 앉은 학생이 현재 학생의 좋아하는 학생인지 확인하고, 맞다면 like를 증가시킴
                 */
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                        if (board[nx][ny] == 0) {
                            empty++;
                        } else {
                            for (int l = 0; l < 4; l++) {
                                if (stuPref.containsKey(student)) {
                                    Set<Integer> preferences = stuPref.get(student);
                                    if (preferences.contains(board[nx][ny])) {
                                        like++;
                                    }
                                }
                            }
                        }
                    }
                }

                /*
                1. 비어있는 칸 중에서 좋아하는 학생이 인접한 칸에 가장 많은 칸으로 자리를 정한다.
                2. 1을 만족하는 칸이 여러 개이면, 인접한 칸 중에서 비어있는 칸이 가장 많은 칸으로 자리를 정한다.
                먼저, 좋아하는 학생이 많이 앉아 있는 좌석을 우선 선택함(maxLike).
                동률인 경우, 더 많은 빈 인접 좌석이 있는 좌석을 우선 선택함(maxEmpty).
                선택된 좌석의 좌표인 (x, y)가 업데이트됨
                 */
                if (maxLike < like || (maxLike == like && maxEmpty <= empty)) {
                    maxLike = like;
                    maxEmpty = empty;
                    x = i; y = j;
                }
            }
        }

        //student 번 학생의 자리는 (x,y)
        board[x][y] = Integer.parseInt(student);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        for (int i = 0; i < N * N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String stuNo = st.nextToken();

            Set<Integer> preferences = new HashSet<>();

            for (int j = 0; j < 4; j++) {
                preferences.add(Integer.parseInt(st.nextToken()));
            }
            stuPref.put(stuNo, preferences); //해시맵에 넣어주기, key ='4' value = [1,2,5.7] 같이 저장됨
            solution(stuNo); // 순서대로 자리 배치 시켜주기
        }

        //만족도 계산. 전체 학생들의 만족도 총합
        int answer = 0;

        //이중 반복문을 통해 각 좌석에서 해당 좌석 주변의 좋아하는 학생의 수를 측정하고, 그에 따라 만족도를 증가시킴
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                String student = String.valueOf(board[i][j]);
                int count = 0;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                        continue;
                    }

                    /*
                    만약 좌석 주변에 좋아하는 학생이 있다면 (stuPref.containsKey(student)),
                    해당 학생이 현재 좌석 주변에 앉아있다면 (preferences.contains(board[nx][ny])), count를 증가시킵
                     */
                    if (stuPref.containsKey(student)) {
                        Set<Integer> preferences = stuPref.get(student);
                        if (preferences.contains(board[nx][ny])) {
                            count++;
                        }
                    }

                }

                if (count == 1) {
                    answer++;
                } else if (count == 2) {
                    answer += 10;
                } else if (count == 3) {
                    answer += 100;
                } else if (count == 4) {
                    answer += 1000;
                }
            }
        }

        System.out.println(answer);
    }
}