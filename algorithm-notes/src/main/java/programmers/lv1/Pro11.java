package programmers.lv1;

import java.util.*;

public class Pro11 {
    public List<Integer> solution(String s) {
        List<Integer> answer = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (!temp.contains(String.valueOf(c))) {
                temp.add(String.valueOf(c));
                answer.add(-1);
            } else {
                for (int i = temp.size() - 1; i >= 0; i--) {
                    if (temp.get(i).equals(String.valueOf(c))) {
                        answer.add(temp.size() - i);
                        temp.add(String.valueOf(c));
                        break;
                    }
                }
            }
        }

        return answer;
    }
    /*
    class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        return answer;
    }
}
     */
    public static void main(String[] args){
        Pro11 pro11 = new Pro11();
        String s = "sss";
        System.out.println(pro11.solution(s));
    }
}
