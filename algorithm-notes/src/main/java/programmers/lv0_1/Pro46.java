package programmers.lv0_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/181915
public class Pro46 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        ArrayList<String> myString = new ArrayList<>(Arrays.asList(my_string.split("")));
        for(int e : index_list){
            answer += myString.get(e);
        }
        return answer;
    }
    // return Arrays.stream(indexList).mapToObj(operand -> String.valueOf(myString.charAt(operand))).collect(Collectors.joining());
    // 'indexList' 배열을 스트림으로 변환합니다.  'mapToObj' 작업을 사용하여 스트림의 각 요소를 변환합니다.
    // Collectors.joining()은 스트림에 있는 요소의 문자열 표현을 단일 문자열로 연결하는 데 사용됩니다. joining() 메소드는 빈 구분 기호를 사용하여 요소를 결합하는 작업을 처리합니다.
    // return Arrays.stream(index_list).mapToObj(i->String.valueOf(my_string.charAt(i))).collect(Collectors.joining());
    public static void main(String[] args){
        Pro46 pro46 = new Pro46();
        String my = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(pro46.solution(my, index_list));
    }
}
