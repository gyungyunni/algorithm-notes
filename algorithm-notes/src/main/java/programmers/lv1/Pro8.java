package programmers.lv1;

public class Pro8 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                // skip 문자열에 포함되어있는지 검사. 포함되어 있지 않다면 idx 즉 이동횟수를 증가. 만일 스킵에 포함되어 있다면 포함 안될때까지 temp+1 해wna!
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        Pro8 pro8 = new Pro8();
        String s = "aukks";
        String skip = "wbqd";
        int index =5;
        System.out.println(pro8.solution(s, skip, index));
    }
}
