package programmers.lv1;

public class Pro10 {
    public int solution(String t, String p) {
        int length = t.length() - p.length() + 1;
        long pNum = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i < length; i++) {
            String temp = t.substring(i, i + p.length());

            if (Long.parseLong(temp) <= pNum) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Pro10 pro10 = new Pro10();
        String t = "3141592";
        String p = "271";
        System.out.println(pro10.solution(t, p));
    }
}
