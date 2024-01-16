package programmers.lv0_2;

import java.util.Arrays;

public class Pro79 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 ==0){
                arr[i] = arr[i]/2;
            } else if (arr[i] < 50 && arr[i]%2 ==1) {
                arr[i] = arr[i] * 2;
            }
        }
        answer = Arrays.copyOfRange(arr,0, arr.length);
        return answer;
    }

    public static void main(String[] args){
        Pro79 pro79 = new Pro79();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(Arrays.toString(pro79.solution(arr)));

    }
}
