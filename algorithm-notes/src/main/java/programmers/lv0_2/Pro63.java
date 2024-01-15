package programmers.lv0_2;

import java.util.Arrays;

public class Pro63 {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if(arr[i] == 1 && i >= idx){
                return i;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Pro63 pro63 = new Pro63();
        int[] arr = {1, 1, 1, 1, 0};
        System.out.println(pro63.solution(arr, 3));
    }
}
