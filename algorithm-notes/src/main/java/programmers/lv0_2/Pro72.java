package programmers.lv0_2;
// https://school.programmers.co.kr/learn/courses/30/lessons/181889
// n번재 원소까지
import java.util.Arrays;

public class Pro72 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,0, n);
    }
    public static void main(String[] args){
        Pro72 pro72 = new Pro72();
        int[] num_list ={2,1,6};
        int n = 1;
        System.out.println(Arrays.toString(pro72.solution(num_list, n)));
    }
}
