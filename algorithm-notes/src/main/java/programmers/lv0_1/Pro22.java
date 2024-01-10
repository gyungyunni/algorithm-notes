package programmers.lv0_1;

public class Pro22 {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = (String.valueOf(a) + String.valueOf(b));
        String ba = (String.valueOf(b) + String.valueOf(a));
        if(Integer.valueOf(ab) - Integer.valueOf(ba) >= 0){
            answer = Integer.valueOf(ab);
        }
        else answer = Integer.valueOf(ba);
        return answer;

        /* // 문자열 + 숫자에서 숫자를 문자열로 처리하기 때문
            public int solution(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;

        return answer;
    }
         */
    }
    public static void main(String[] args) {
        Pro22 pro22 = new Pro22();
        System.out.println(pro22.solution(9, 91));
    }
}
