package study.barkingDog.chapter.stack2;
import java.util.*;
import java.io.*;
public class Boj2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int sum = 0; // 누적해서 더해질 값
        int num = 1; // 곱해질 값
        boolean mismatch = false;

        String s = br.readLine();
        Character[] str = new Character[s.length()];
        int j = 0;
        for (Character c : s.toCharArray()) {
            str[j] = c;
            j++;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(') {
                num *= 2; // 소괄호가 나오면 곱해질 값 2배 증가
                stack.push(str[i]);
            } else if (str[i] == '[') {
                num *= 3;  // 대괄호가 나오면 곱해질 값 3배 증가
                stack.push(str[i]);
            } else if (str[i] == ')') {
                if (stack.empty() || stack.peek() != '(') { // 스택이 비어있는데 나왔거나, 스택에 맨 위에 값이 (가 아닌 경우
                    mismatch = true;
                    break;
                }
                if (str[i - 1] == '(') {
                    sum += num;  // 직전 괄호가 여는 괄호였다면 sum에 값 추가
                }
                stack.pop(); // (()) 이었을 때, 안에 있는 () 지우는거. 실제로는 ( 만 지우긴 함.
                num /= 2;  // 소괄호 쌍이 사라졌으니 2로 나눔. 2 곱했던거 다시 나눠주는것
            } else { // str[i] == ']' . 소괄호 일때처럼 하기
                if (stack.empty() || stack.peek() != '[') {
                    mismatch = true;
                    break;
                }
                if (str[i - 1] == '[') {
                    sum += num;  // 직전 괄호가 여는 괄호였다면 sum에 값 추가
                }
                stack.pop();
                num /= 3;  // 대괄호 쌍이 사라졌으니 3로 나눔
            }
        }

        answer = mismatch || !stack.empty() ? 0 : sum;
        System.out.println(answer);
    }
}
