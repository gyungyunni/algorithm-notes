package programmers.lv1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Pro7 {
    // 큐
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> c1 = new LinkedList<>();
        Collections.addAll(c1, cards1);
        Queue<String> c2 = new LinkedList<>();
        Collections.addAll(c2, cards2);

        for (String g: goal){
            if(g.equals(c1.peek())){
                c1.poll();
            } else if (g.equals(c2.peek())) {
                c2.poll();
            } else answer = "No";
        }

        return answer;
    }
    public static void main(String[] args) {
        Pro7 pro7 = new Pro7();
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(pro7.solution(cards1, cards2, goal));
    }
}
