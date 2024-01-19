package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/133499
public class Pro19 {
    public int solution(String[] babblings) {

        int answer = 0;
        for(int i = 0; i < babblings.length; i++) {
            if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
                continue;
            }

            babblings[i] = babblings[i].replace("aya", " ");
            babblings[i] = babblings[i].replace("ye", " ");
            babblings[i] = babblings[i].replace("woo", " ");
            babblings[i] = babblings[i].replace("ma", " ");
            babblings[i] = babblings[i].replace(" ", "");

            if(babblings[i].length()  == 0) answer++;

        }
        return answer;
    }

    public static void main(String[] args) {
        Pro19 pro19 = new Pro19();
        String[] babbling = {"aya", "yee", "u", "maa"};
        System.out.println(pro19.solution(babbling));
    }
}
