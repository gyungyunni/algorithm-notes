package study.barkingDog.chapter.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[] alpa = new int[26];
        char[] words1 = str1.toCharArray();
        char[] words2 = str2.toCharArray();
        for (char ch : words1) alpa[ch-97]++;
        for (char ch : words2) alpa[ch-97]--;
        int answer = 0;
        for (int j : alpa)
            if(j!=0) answer += Math.abs(j);
        System.out.println(answer);

    }
}
