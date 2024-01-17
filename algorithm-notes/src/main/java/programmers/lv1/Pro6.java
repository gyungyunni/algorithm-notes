package programmers.lv1;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/160586
public class Pro6 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int j = 0; j < key.length(); j++) {

                char ch = key.charAt(j);

                if (map.containsKey(ch)){
                    if(map.get(ch)> j ){
                        // 첫 번째 키 "ABACD"를 처리한 후의 맵은 {A=1, B=2, C=3, D=4}
                        // 두 번째 키 "BCEFD"를 처리하는 경우:
                        // {A=1, B=2, C=2, D=4, E=3, F=4}
                        // 현재 위치가 더 작을 경우 더 작은 값으로 지도를 업데이트
                        map.replace(ch,j+1); // 현재위치가 더 작은 값이므로 현재 위치로
                    }
                }else{
                    map.put(ch,j+1); // 현재 위치 j+1
                }
            }
        }

        for(int i=0; i< targets.length;i++){
            int sum = 0;
            for(int j=0; j<targets[i].length();j++){

                char ch = targets[i].charAt(j);

                if(map.containsKey(ch)){
                    sum+=map.get(ch);
                }else{
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
    public static void main(String[] args) {
        Pro6 pro6 = new Pro6();
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        System.out.println(Arrays.toString(pro6.solution(keymap, targets)));
    }
}
