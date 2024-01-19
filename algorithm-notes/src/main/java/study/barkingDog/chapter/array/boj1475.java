package study.barkingDog.chapter.array;

import java.util.*;

public class boj1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int set = 0;
        int[] num = new int[10]; // 0,1,2,3,4,5,6,7,8,9

        // 입력받은거 num 배열에 넣기
        for (char n : N.toCharArray()) {
            int s;
            s = n - '0'; // 아스키코드로 저장되어서 - '0'
            num[s]++;
        }

        if ((num[9] - num[6]) >= 2) { // 9996 같은 경우, 2세트가 필요해서 num[9] = 3을 2로 바꿔줌
            num[9] = (int) Math.ceil(num[9] / 2.0);
        }

        if ((num[6] - num[9]) >= 2) {
            num[6] = (int) Math.ceil(num[6] / 2.0);
        }

        set = Arrays.stream(num).max().orElseThrow();
        System.out.println(set);
    }
}
