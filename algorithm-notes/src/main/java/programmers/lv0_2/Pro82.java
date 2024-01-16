package programmers.lv0_2;

// https://school.programmers.co.kr/learn/courses/30/lessons/181879
public class Pro82 {
    public int solution(int[] num_list) {
        int answer = (num_list.length < 11 ? 1 : 0);

        if(num_list.length>=11){
            for(int i=0; i<num_list.length;i++){
                answer += num_list[i];
            }
        }else{
            for(int i=0; i<num_list.length; i++){
                answer *=num_list[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Pro82 pro82 = new Pro82();
        int[] num_list = {2, 3, 4, 5};
        System.out.println(pro82.solution(num_list));
    }
}
