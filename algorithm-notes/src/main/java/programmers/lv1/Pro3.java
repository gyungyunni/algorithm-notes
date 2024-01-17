package programmers.lv1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/172928
public class Pro3 {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int startH = 0;
        int startW = 0;

        for (int i = 0; i < h; i++) {
            int index = park[i].indexOf('S');
            if (index != -1) {
                startH = i;
                startW = index;
                break;
            }
        }

        for(String route : routes){
            String d = route.split(" ")[0];
            int move = Integer.parseInt(route.split(" ")[1]);

            // 업데이트 될 좌표
            int moveH = startH; // 세로
            int moveW = startW; // 가로

            for(int i=0; i<move; i++)
            {
                switch(d) {
                    case "S" : moveH++; break;
                    case "N" : moveH--; break;
                    case "E" : moveW++; break;
                    case "W" : moveW--; break;
                }
                // 바둑판 안에 들어있고
                if(moveH >= 0 && moveH < h && moveW >= 0 && moveW < w){
                    // 장애물을 만나면
                    if(park[moveH].substring(moveW, moveW+1).equals("X")){
                        break;
                    }
                    // 정상적으로 이동했으면 좌표 업데이트
                    if(i == move-1){
                        startH = moveH;
                        startW = moveW;
                    }
                }
            }

        }
        int[] answer = {startH,startW};
        return answer;
    }

    public static void main(String[] args) {
        Pro3 pro3 = new Pro3();
        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        System.out.println(Arrays.toString(pro3.solution(park, routes)));
    }
}
