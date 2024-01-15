package programmers.lv0_2;
// 접두사인지 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class Pro55 {
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
    public static void main(String[] args){
        Pro55 pro55 = new Pro55();
        System.out.println(pro55.solution("ProgrammerS", "ban"));
    }
}