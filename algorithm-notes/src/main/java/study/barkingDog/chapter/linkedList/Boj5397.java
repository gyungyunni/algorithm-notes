package study.barkingDog.chapter.linkedList;

import java.io.*;
import java.util.Stack;

public class Boj5397 {
    public static void main(String[] args) throws IOException {
        // BufferedREader 를 통해 입력 값 얻기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        String[] input;
        // Test케이스의 갯수를 입력받는 코드
        // String 배열의 input 생성

        for(int i=0;i<T;i++) {
            Stack<String> stL = new Stack<>();
            Stack<String> stR = new Stack<>();
            input = br.readLine().split("");

            for (String str : input) {
                switch (str) {
                    case "<":
                        if(!stL.isEmpty()){
                            stR.push(stL.pop());
                        }
                        break;

                    case ">":
                        if (!stR.isEmpty()) {
                            stL.push(stR.pop());
                        }
                        break;

                    case "-":
                        if (!stL.isEmpty()) {
                            stL.pop();
                        }
                        break;

                    default:
                        stL.push(str);
                }
            }


            while (!stL.isEmpty()) {
                stR.push(stL.pop());
            }
            while (!stR.isEmpty()) {
                sb.append(stR.pop());
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }
}