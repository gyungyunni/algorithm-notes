package programmers.lv0_2;
// https://school.programmers.co.kr/learn/courses/30/lessons/181875
import java.util.Arrays;

public class Pro86 {
    public String[] solution(String[] strArr) {

        for (int i =0; i < strArr.length; i++){
            strArr[i] = i%2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return strArr;
    }
    public static void main(String[] args) {
        Pro86 pro86 = new Pro86();
        String[] strArr = {"AAA","BBB","CCC","DDD"};
        System.out.println(Arrays.toString(pro86.solution(strArr)));
    }
}
