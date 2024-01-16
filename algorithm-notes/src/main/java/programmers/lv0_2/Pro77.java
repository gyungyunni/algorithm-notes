package programmers.lv0_2;

public class Pro77 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int num : numbers){
            answer += num;
            if(answer > n){
                return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Pro77 pro77 = new Pro77();
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        System.out.println(pro77.solution(numbers, n));

    }
}
