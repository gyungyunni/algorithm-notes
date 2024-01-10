package programmers.lv0_1;

import java.util.Scanner;
public class Pro16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            System.out.println(c);
        }
    }
}