package programmers.lv0_2;

public class Pro54 {
    public String solution(String my_string, int n) {
        return my_string.substring(0,n);
    }
    public static void main(String[] args){
        Pro54 pro54 = new Pro54();
        System.out.println(pro54.solution("ProgrammerS", 11));
    }
}
