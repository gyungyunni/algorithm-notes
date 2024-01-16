package programmers.lv0_2;

import java.util.Arrays;

public class Pro78 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries){
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Pro78 pro78 = new Pro78();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0,1},{1,2},{2,3}};
        System.out.println(Arrays.toString(pro78.solution(arr, queries)));

    }
}
