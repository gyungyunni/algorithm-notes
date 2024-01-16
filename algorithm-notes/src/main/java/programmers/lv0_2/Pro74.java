package programmers.lv0_2;

import java.util.ArrayList;

public class Pro74 {
    public int solution(int[] num_list) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 1; i < num_list.length; i+=2) {
            sumOdd += num_list[i];
        }
        for (int i = 0; i < num_list.length; i+=2) {
            sumEven += num_list[i];
        }
        return (sumOdd >= sumEven) ? sumOdd : sumEven;
    }
    public static void main(String[] args){
        Pro74 pro74 = new Pro74();
        int[] num_list ={4, 2, 6, 1, 7, 6};
        System.out.println(pro74.solution(num_list));
    }
}
