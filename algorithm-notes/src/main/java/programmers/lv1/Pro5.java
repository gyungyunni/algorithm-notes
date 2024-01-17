package programmers.lv1;

import java.util.Arrays;

public class Pro5 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] area = new boolean[n];
        Arrays.fill(area,true);
        for(int sec : section)
        {
            area[sec-1] = false;
        }

        for (int sec : section) {
            if (!area[sec - 1] ) {
                if(sec - 1 + m <= area.length) {
                    for (int i = sec - 1; i < sec - 1 + m; i++) {
                        area[i] = true;
                    }
                }
                if(sec - 1 + m > area.length) {
                    for (int i = sec - 1; i < area.length; i++) {
                        area[i] = true;
                    }
                }
                answer++;

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Pro5 pro5 = new Pro5();
        int n = 5;
        int m = 2;
        int[] section ={1, 4};
        System.out.println(pro5.solution(n,m,section));
    }
}
