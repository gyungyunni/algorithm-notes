package programmers.lv1;

import java.util.ArrayList;

public class Pro18 {

    // x = 빵, y = 야채, z= 고기 일때, x y z x 로 되어있어야 햄버거 만들기 가능
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder builder = new StringBuilder();

        for (int i : ingredient) {
            builder.append(String.valueOf(i));

            //뒤에서 부터 제거해야 중복 안됨.
            while (builder.length() >= 4 && builder.substring(builder.length() - 4).equals("1231")) {
                builder.replace(builder.length() - 4, builder.length(), "");
                answer++;
            }
        }
        return answer;
    }
    /* 지리는 코드, 스택으로 넣음과 동시에 검사하는 코드
       public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1
                && stack[sp - 2] == 3
                && stack[sp - 3] == 2
                && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }
     */
    public static void main(String[] args){
        Pro18 pro18 = new Pro18();
        int[] ingredient = {1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1, 1};
        System.out.println(pro18.solution(ingredient));
    }
}
