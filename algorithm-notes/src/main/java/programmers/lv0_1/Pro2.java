package programmers.lv0_1;

import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/250132?language=java
public class Pro2 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int c = sc.nextInt();

            int b_square = c*c - a*a;

            System.out.println(b_square);
        }
    }