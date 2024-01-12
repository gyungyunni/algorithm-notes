package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181926
// 수 조작하기
public class Pro35 {
    public int solution(int n, String control) {
        int answer = 0;
        for (int i = 0; i < control.length(); i++) {
            switch (control.substring(i,i+1)){
                case "w":
                    n += 1;
                    break;
                case "s":
                    n -= 1;
                    break;
                case "d":
                    n += 10;
                    break;
                case "a":
                    n -= 10;
                    break;
                default:
                    break;
            }
        }
        answer = n;
        return answer;
    }
    public static void main(String[] args){
        Pro35 pro35 = new Pro35();
        System.out.println(pro35.solution(0, "wsdawsdassw"));
    }
}
