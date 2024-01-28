package study.barkingDog.studyTime.thirdWeek;
// https://school.programmers.co.kr/learn/courses/30/lessons/92334
import java.util.*;

public class Pro2 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> idIndex = new HashMap<>();
        Map<String, List<String>> reportMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            idIndex.put(id_list[i], i);
            reportMap.put(id_list[i], new ArrayList<>());
        }

        for (String reported : report) {
            String[] temp = reported.split(" ");
            if (!reportMap.get(temp[1]).contains(temp[0])) {  // 중복검사
                reportMap.get(temp[1]).add(temp[0]);
            }
        }
        /* add를 하면 리스트에 추가됨.
        reportMap = {
           "muzi": ["frodo", "neo"],
            "frodo": ["neo"],
            "apeach": ["frodo", "muzi"],
            "neo": []
            }
         */

        for (String id : reportMap.keySet()) {
            if (k <= reportMap.get(id).size()) {
                for (String reporter : reportMap.get(id)) {
                    answer[idIndex.get(reporter)]++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Pro2 pro2 = new Pro2();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(pro2.solution(id_list, report, k)));
    }
}
