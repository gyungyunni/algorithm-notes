package programmers.lv1;

public class Pro17 {
    public String solution(int[] food) {
        StringBuilder builder = new StringBuilder();
        for (int i=1; i<food.length; i++) {
            int result = food[i] / 2;
            builder.append(String.valueOf(i).repeat(result));
        }
        String answer = builder + "0";
        return answer + builder.reverse();
    }
    public static void main(String[] args){
        Pro17 pro17 = new Pro17();
        int[] food = {1, 7, 1, 2};
        System.out.println(pro17.solution(food));
    }
}
