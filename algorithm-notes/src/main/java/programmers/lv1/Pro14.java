package programmers.lv1;
import java.util.*;
public class Pro14 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] num = new int[number];
        Arrays.fill(num, 1);
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i/2; j++) {
                if(i % j == 0){
                    num[i-1] ++;
                    if(num[i-1] > limit){
                        num[i-1] = power;
                        break;
                    }
                }
            }
            answer += num[i-1];
        }

        return answer;
    }
    /*  약수 빠르게 구하기
     public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
     */
    public static void main(String[] args){
        Pro14 pro14 = new Pro14();
        int number =5;
        int limit = 3;
        int power = 2;
        System.out.println(pro14.solution(number, limit, power));
    }
}
