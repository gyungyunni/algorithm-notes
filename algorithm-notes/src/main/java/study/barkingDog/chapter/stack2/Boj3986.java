package study.barkingDog.chapter.stack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        String s;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            s = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (Character c : s.toCharArray()) {
                if(!stack.isEmpty() && stack.peek() == c){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if(stack.isEmpty())
                cnt++;
            answer += cnt;
        }
        System.out.println(answer);
    }
}