package programmers.lv0_1;

//https://school.programmers.co.kr/learn/courses/30/lessons/181949
import java.util.Scanner;

public class Pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for(int i = 0; i< a.length();i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            } else{
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}