package study.barkingDog.studyTime.thirdWeek;

import java.util.*;
class Pro1{
    public int[] solution(String s) {
        int[] answer = {};
        int zeroNum = 0 , num =0;
        int totalCnt = 0, cnt =0;
        while(true){
            num =0;
            cnt = 0;
            for(Character c : s.toCharArray()){
                if(c == '0'){
                    num ++;    // 제거할 0의 개수
                }
            }
            s = s.length() - num +"";
            s = Integer.toBinaryString(Integer.parseInt(s));
            cnt++;
            zeroNum += num;
            totalCnt += cnt;
            if(s.equals("1")){
                break;
            }
        }
        answer = new int[]{totalCnt, zeroNum};
        return answer;
    }
    public static void main(String[] args){
        Pro1 pro1 = new Pro1();
        String s = "110010101001";
        System.out.println(Arrays.toString(pro1.solution(s)));
    }
}