package programmers.lv0_2;

import java.util.Arrays;

public class Pro71 {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int i =0;
        for (String ele : str_list){
            if(ele.equals("l")){
                answer = Arrays.copyOfRange(str_list,0, i);
                break;
            }
            i ++;
            if(ele.equals("r")){
                answer = Arrays.copyOfRange(str_list, i, str_list.length);
                break;
            }

        }
        return answer;
    }
    public static void main(String[] args){
        Pro71 pro71 = new Pro71();
        String[] str_list = {"r", "u", "d", "d"};
        System.out.println(Arrays.toString(pro71.solution(str_list)));
    }
}
