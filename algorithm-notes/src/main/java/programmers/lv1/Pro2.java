package programmers.lv1;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class Pro2 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i=0; i< name.length; i++){
            map.put(name[i],yearning[i]);
        }

        for(int i =0; i< photo.length;i++){
            String[] persons = photo[i];
            int score = 0;
            for(int j=0; j<persons.length; j++){
                String person = persons[j];
                if(map.containsKey(person)){
                    score+=map.get(person);
                }
            }
            answer[i]=score;
        }

        return answer;
    }
    public static void main(String[] args) {
        Pro2 pro2 = new Pro2();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(pro2.solution(name, yearning, photo)));
    }
}
