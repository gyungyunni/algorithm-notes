package study.barkingDog.studyTime.fourthWeek;
// https://school.programmers.co.kr/learn/courses/30/lessons/72410

public class Pro1 {
    public String solution(String new_id) {
        String answer = new_id;

        answer = answer.toLowerCase(); // 1번

        String answer3 = "";
        //2번
        for (char c : answer.toCharArray()) {
            if ((97 <= c && c <= 122) || (48 <= c && c <= 57) || c == '-' || c == '_' || c == '.') {
                answer3 += c;
            }
        }
        // 3단계
        while(answer3.contains("..")){
            answer3 = answer3.replace("..",".");
        }

        if(answer3.length() > 0) {
            // 4단계
            if (answer3.charAt(0) == '.') {
                answer3 = answer3.substring(1, answer3.length());
            }
        }
        if(answer3.length() > 0) {
            if (answer3.charAt(answer3.length() - 1) == '.') {
                answer3 = answer3.substring(0, answer3.length() - 1);
            }
        }
        //5단계
        if(answer3.length() == 0){
            answer3 += "a";
        }
        //6단계
        if(answer3.length() >= 16){
            answer3 = answer3.substring(0,15);
        }
        if(answer3.charAt(answer3.length()-1) =='.'){
            answer3 = answer3.substring(0, answer3.length()-1);
        }

        //7단계
        if(answer3.length() <= 2){
            while(answer3.length() <=2){
                answer3 += answer3.charAt(answer3.length()-1);
            }
        }
        return answer3;
    }
    public static void main(String[] args) {
        Pro1 pro1 = new Pro1();
        String new_id = "abcdefghijklmn.p";
        System.out.println(pro1.solution(new_id));
    }
}
