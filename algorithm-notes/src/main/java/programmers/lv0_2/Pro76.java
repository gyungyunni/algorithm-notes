package programmers.lv0_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Pro76 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String str = "";
        for(int i=0; i<finished.length; i++){
            str = finished[i] == false ? str+todo_list[i]+"," : str;
        }

        return str.split(",");
    }
    public static void main(String[] args){
        Pro76 pro76 = new Pro76();
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        System.out.println(Arrays.toString(pro76.solution(todo_list, finished)));
    }
}
