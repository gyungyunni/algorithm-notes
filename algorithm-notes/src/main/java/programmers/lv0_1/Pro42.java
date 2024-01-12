package programmers.lv0_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Pro42 {
    public int[] solution(int n) {
        String str = n + " ";
        while (n != 1) { // n이 1이 아닌 동안
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            str += n + " ";
        }
        String[] arr = str.split(" ");
        int[] answer = new int[arr.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
    /*
        public int[] solution(int n) {
        return IntStream.concat(
                        IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
                        IntStream.of(1))
                .toArray();
    }
     */
    public static void main(String[] args){
        Pro42 pro42 = new Pro42();
        System.out.println(Arrays.toString(pro42.solution(10)));
    }
}
