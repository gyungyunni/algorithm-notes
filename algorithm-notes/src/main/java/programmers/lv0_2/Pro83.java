package programmers.lv0_2;

// https://school.programmers.co.kr/learn/courses/30/lessons/181878
// 원하는 문자열 찾기
public class Pro83 {
    public int solution(String myString, String pat) {
        int answer = 0;
        if (myString.length() - pat.length() >= 0) {
            for (int i = 0; i <= (myString.length() - pat.length()); i++) {
                if (myString.substring(i, i + pat.length()).equalsIgnoreCase(pat)) {
                    answer = 1;
                    break;
                }
            }
        } else {
            answer = 0;
        }
        return answer;
    }
    /* contains 있음
     public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.toLowerCase().contains(pat.toLowerCase())) {
            answer = 1;
        }
        return answer;
    }
     */

    public static void main(String[] args) {
        Pro83 pro83 = new Pro83();
        String myString = "AbCdEfG";
        String pat = "aBc";
        System.out.println(pro83.solution(myString, pat));
    }
}
