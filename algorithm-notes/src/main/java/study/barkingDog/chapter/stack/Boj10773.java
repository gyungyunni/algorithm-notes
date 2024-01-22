package study.barkingDog.chapter.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < k; i++) {
            myStack.add(Integer.parseInt(br.readLine()));
            if(myStack.peek() == 0){
                myStack.pop();
                myStack.pop();
            }
        }
        int answer =0;
        for (int e :myStack){
            answer += e;
        }
        System.out.println(answer);
    }
}