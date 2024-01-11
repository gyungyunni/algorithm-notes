package programmers.lv0_1;
// https://school.programmers.co.kr/learn/courses/30/lessons/181927#
// 마지막 두 원소
import java.util.Arrays;

public class Pro34 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        answer[num_list.length] = num_list[num_list.length-1] > num_list[num_list.length-2] ? num_list[num_list.length-1]-num_list[num_list.length-2]:num_list[num_list.length-1]*2;
        return answer;
    }

    public static void main(String[] args){
        int[] num_list = {2,1,6};
        Pro34 pro34 = new Pro34();
        System.out.println((Arrays.toString(pro34.solution(num_list))));
    }
}
