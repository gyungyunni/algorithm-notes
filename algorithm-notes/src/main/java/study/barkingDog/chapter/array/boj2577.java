package study.barkingDog.chapter.array;

import java.util.Scanner;

public class boj2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        String num = String.valueOf(A*B*C);
        for (int i = 0; i < 10; i++) {
            int origin = num.length();
            if(num.contains(String.valueOf(i))) {
                num = num.replace(String.valueOf(i), "");
                System.out.println(origin - num.length());
            }
            else
                System.out.println(0);
        }
    }
}
