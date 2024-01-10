package programmers.lv0_1;
// https://school.programmers.co.kr/learn/courses/30/lessons/181935
// 홀짝에 따라 다른 값 반환하기
public class Pro26 {
    public int solution(int n) {
        int answer = 0;
        if(n%2 == 1){
            for (int i = 1; i <= n; i++) {
                if(i%2 == 1)
                    answer += i;
            }
        }
        else{
            for (int i = 2; i <= n; i++) {
                if(i%2 == 0)
                    answer += i*i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Pro26 pro26 = new Pro26();
        System.out.println(pro26.solution(10));
    }
}
