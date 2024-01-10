package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181941
public class Pro20 {
    public String solution(String[] arr) {
        String answer = "";
        for(String element : arr){
            answer += element;
        }
        return answer;
    }
    public static void main(String[] args) {
        Pro20 pro20 = new Pro20();
        String[] arr = {"a","b","c"};
        System.out.println(pro20.solution(arr));
    }
}