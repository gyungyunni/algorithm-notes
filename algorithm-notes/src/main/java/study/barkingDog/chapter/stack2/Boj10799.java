package study.barkingDog.chapter.stack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String s;
        s = br.readLine();
        Character[] str = new Character[s.length()];
        int i =0;
        for(Character c : s.toCharArray()){
            str[i] = c;
            i++;
        }
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < str.length; j++) {
            if(str[j] == '('){
                stack.push(str[j]);
            }
            else{
                if(str[j-1] == '('){ // 레이저일 경우
                    stack.pop();  // 앞에서 막대라고 착각하고 stack에 s[i]를 넣었으므로 pop
                    answer += stack.size(); // 막대의 개수만큼 ans에 추가
                }
                else{         // 막대의 끝일 경우
                    stack.pop();   // 막대의 개수를 1 감소
                    answer ++;   // 막대 1개가 절단된 것과 동일한 상황이므로 ans에 1 추가
                }
            }
        }

        System.out.println(answer);
    }
}

