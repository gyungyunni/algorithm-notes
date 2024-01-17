package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// https://school.programmers.co.kr/learn/courses/30/lessons/161990
public class Pro4 {
    public int[] solution(String[] wallpaper) {

        int h = wallpaper.length;
        int w = wallpaper[0].length();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        int i = 0;
        for (String ele : wallpaper){
            for (int j = 0; j < ele.length(); j++) {
                if (ele.charAt(j) == '#') {
                    x.add(i); // #이 들어간 행 넣기
                    y.add(j); // #이 들어간 열 찾기
                }
            }
            i++;
        }

        int lux = Collections.min(x);
        int luy = Collections.min(y);
        int rdx = Collections.max(x);
        int rdy = Collections.max(y);
        int[] answer = {lux, luy, rdx+1, rdy+1};

        return answer;
    }
    public static void main(String[] args) {
        Pro4 pro4 = new Pro4();
        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(pro4.solution(wallpaper)));
    }
}
