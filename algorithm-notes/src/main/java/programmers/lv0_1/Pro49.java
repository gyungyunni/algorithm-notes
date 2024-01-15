package programmers.lv0_1;

//https://school.programmers.co.kr/learn/courses/30/lessons/181912
//배열 만들기 5
import java.util.ArrayList;
import java.util.Arrays;

public class Pro49 {

    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> answer= new ArrayList<>();
        for(String e : intStrs){
            if(Integer.parseInt(e.substring(s,s+l)) > k){
               answer.add(Integer.parseInt(e.substring(s,s+l)));
            }
        }
        return answer;
    }
    // return Arrays.stream(intStrs).mapToInt(value -> Integer.parseInt(value.substring(s, s + l))).filter(value -> value > k).toArray();
    public static void main(String[] args) {
        Pro49 pro49 = new Pro49();
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        System.out.println(pro49.solution(intStrs, 50000, 5, 5));
    }
}
