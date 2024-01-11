package programmers.lv0_1;

public class Pro32 {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        for(int m : num_list){
            mul *= m;
        }
        for(int s : num_list){
            sum += s;
        }
        if(mul < (sum*sum))
            answer = 1;

        if(mul > (sum*sum))
            answer = 0;

        return answer;
    }
    public static void main(String[] args){
        Pro32 pro32 = new Pro32();
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(pro32.solution(num_list));
    }
}