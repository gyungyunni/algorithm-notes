package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/178871

import java.util.*;

public class Pro1 {
    public String[] solution(String[] players, String[] callings) {
        int n = players.length;
        HashMap<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            indexMap.put(players[i], i);
        }

        for (String calling : callings) {
            int idx = indexMap.get(calling);

            // 선수가 첫 번째 위치에 있지 않으면
            if (idx > 0) {
                String temp = players[idx - 1];
                players[idx - 1] = players[idx];
                players[idx] = temp;

                indexMap.put(players[idx - 1], idx - 1);
                indexMap.put(players[idx], idx);
            }
        }

        return players;
    }

    public static void main(String[] args) {
        Pro1 pro1 = new Pro1();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(pro1.solution(players, callings)));
    }
}
