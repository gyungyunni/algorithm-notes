package programmers.lv0_1;

import java.util.Scanner;

public class Pro17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n + " is even");
        }
        else
            System.out.println(n + " is odd");
    }
}