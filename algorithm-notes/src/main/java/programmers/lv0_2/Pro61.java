package programmers.lv0_2;

import java.util.Arrays;
import java.util.Collections;

public class Pro61 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            answer += x;
        }
        return answer;
    }

    public static void main(String[] args){
        Pro61 pro61 = new Pro61();
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(pro61.solution("apporoograpemmemprs", indices));
    }
}
