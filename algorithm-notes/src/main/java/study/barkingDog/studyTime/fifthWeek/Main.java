package study.barkingDog.studyTime.fifthWeek;

import java.util.*;
import java.io.*;

// Boj21608 리팩토링
public class Main {

    static int N;
    static int[][] board;
    static HashMap<String, Set<Integer>> stuPref = new HashMap<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void solution(String student){

        int maxEmpty = 0;
        int maxLike = 0;
        int x = 0;
        int y =0;

        for (int i = N-1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                if (board[i][j] != 0) {
                    continue;
                }

                int empty = 0;
                int like = 0;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < N){
                        if (board[nx][ny] == 0) {
                            empty++;
                        } else {
                            for (int l = 0; l < 4; l++) {
                                Set<Integer> preferences = stuPref.get(student);
                                if (preferences.contains(board[nx][ny])) {
                                    like++;
                                }
                            }
                        }
                    }

                }

                if (maxLike < like || (maxLike == like && maxEmpty <= empty)){
                    maxLike = like;
                    maxEmpty = empty;
                    x = i;
                    y = j;
                }

            }
        }
        board[x][y] = Integer.parseInt(student);
    }
    public static int satisfaction(){
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                String student = String.valueOf(board[i][j]);
                int count = 0;

                for (int k = 0; k < 4; k++) {
                    int nx = i +dx[k];
                    int ny = j + dy[k];

                    if(nx<0 || nx >= N || ny < 0 || ny >= N){
                        continue;
                    }
                    if(stuPref.containsKey(student)){
                        Set<Integer> prefer =stuPref.get(student);
                        if(prefer.contains(board[nx][ny])){
                            count ++;
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

        return answer;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        for (int i = 0; i < N*N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String stuNo = st.nextToken();

            Set<Integer> preferences = new HashSet<>();

            for (int j = 0; j < 4; j++) {
                preferences.add(Integer.parseInt(st.nextToken()));
            }
            stuPref.put(stuNo, preferences);
            solution(stuNo);
        }

        System.out.println(satisfaction());

    }

}
