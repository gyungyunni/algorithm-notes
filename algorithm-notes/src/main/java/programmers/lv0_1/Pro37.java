package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181924
// 수열과 구간 쿼리3

public class Pro37 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i =0; i < queries.length; i++)
            for(int j =0; j < 1; j++)
                swap(arr, queries[i][j],queries[i][j+1] );

        return answer;
    }

    private static void swap(int[] arr, int i, int i1) {
        int[] temp = new int[1];
        temp[0] = arr[i1];
        arr[i1] = arr[i];
        arr[i] = temp[0];
    }
}
