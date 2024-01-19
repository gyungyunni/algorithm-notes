package study.barkingDog.studyTime.firstWeek;

import java.util.*;

public class boj2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(2 * (n - i) - 1));
        }

        for (int i = 1; i < n; i++) {
            System.out.print(" ".repeat(n - 1 - i));
            System.out.println("*".repeat(2 * i + 1));
        }
    }
}