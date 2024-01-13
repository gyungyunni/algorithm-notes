package programmers.lv0_1;

import java.util.*;

public class Pro45 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>(List.of(a,b,c,d));
        Collections.sort(list); //오름차순
        if(a == b && b == c && c == d){
           answer = a * 1111;
        }
        if(list.get(0) == list.get(1) && list.get(0) == list.get(2) && list.get(0) != list.get(3))
        {
            answer = (10 * list.get(0) + list.get(3)) * (10 * list.get(0) + list.get(3));
        }
        if(list.get(3) == list.get(2) && list.get(3) == list.get(1) && list.get(3) != list.get(0)){
            answer = (10 * list.get(3) + list.get(0)) * (10 * list.get(3) + list.get(0));
        }
        if(list.get(0) == list.get(1) && list.get(2) == list.get(3) && list.get(1) != list.get(2)){
            answer = (list.get(0) + list.get(2)) * Math.abs(list.get(0) - list.get(2));
        }
        if((list.get(0) == list.get(1)) && (list.get(2) != list.get(3)) && (list.get(1) != list.get(2)&& (list.get(2)!=list.get(3)))
        ){
            answer = list.get(2) * list.get(3);
        }
        if((list.get(1) == list.get(2)) && (list.get(2) != list.get(3)) && (list.get(2) != list.get(0)) )
        {
            answer = list.get(0) * list.get(3);
        }
        if((list.get(2) == list.get(3)) && (list.get(2) != list.get(1)) && (list.get(2) != list.get(0) && (list.get(0)!=list.get(1)))
        ){
            answer = list.get(0) * list.get(1);
        }
        if(list.get(0) != list.get(1) && list.get(0) != list.get(2) && list.get(0) != list.get(3)
                && list.get(1) != list.get(2) && list.get(1) != list.get(3) && list.get(2) != list.get(3)
        ){
            answer = list.get(0);
        }
        return answer;
    }
    public static void main(String[] args){
        Pro45 pro45 = new Pro45();
        System.out.println(pro45.solution(6,3,3,6));
    }
}
