package programmers.lv0_1;

//9로 나눈 나머지
import java.util.ArrayList;
import java.util.Arrays;

public class Pro47 {

    public int solution(String number) {
        int answer =0;
        int[] num = new int[number.length()];
        ArrayList<String> myNumber = new ArrayList<>(Arrays.asList(number.split("")));
        for(int i=0; i<myNumber.size(); i++){
            num[i] = Integer.parseInt(myNumber.get(i));
        }
        for(int e : num){
             answer += e;
        }
        return answer%9;
    }

    public static void main(String[] args){
        Pro47 pro47 = new Pro47();
        System.out.println(pro47.solution("78720646226947352489"));
    }
}
