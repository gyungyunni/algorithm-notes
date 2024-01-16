package programmers.lv0_2;

import java.util.Arrays;
// https://school.programmers.co.kr/learn/courses/30/lessons/181897
// 리스트 자르기
public class Pro64 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        switch (n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, slicer[1]+1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                break;
            case 4:
                int size = (slicer[1] - slicer[0]) / slicer[2] + 1;
                answer = new int[size];
                int index = 0;
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    answer[index++] = num_list[i];
                }
                break;
            default:
                answer = new int[0];
        }
        return answer;
    }
    public static void main(String[] args){
        Pro64 pro64 = new Pro64();
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(pro64.solution(1, slicer, num_list)));
    }
}
