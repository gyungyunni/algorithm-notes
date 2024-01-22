package study.barkingDog.chapter.array;

import java.util.Scanner;

public class Boj10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] word = new int[26];
        for(Character w : s.toCharArray()){
            word[w - 'a']++;
        }
        for (int n : word){
            System.out.print(n+" ");
        }
    }
}
