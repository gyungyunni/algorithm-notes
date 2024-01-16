package programmers.lv0_2;

// https://school.programmers.co.kr/learn/courses/30/lessons/181894
// 2의 영역

import java.util.ArrayList;

public class Pro67 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int twoNum = 0;
        for (int ele : arr) {
            if (ele == 2) {
                twoNum++;
            }
        }
        if (twoNum == 0) {
            answer.add(-1);
        } else if (twoNum == 1) {
            answer.add(2);
        } else {
            int[] twoIndex = new int[twoNum];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 2) {
                    twoIndex[index++] = i;
                }
            }
            for (int j = twoIndex[0]; j <= twoIndex[twoNum - 1]; j++) {
                answer.add(arr[j]);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Pro67 pro67 = new Pro67();
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        System.out.println(pro67.solution(arr));
    }
}
