package programmers.lv0_2;


public class Pro65 {
    public int solution(int[] num_list) {
        int answer = -1;
        int i = 0;
        for (int ele : num_list){
            if(ele < 0) {
                answer = i;
                break;
            }
            i ++;
        }
        return answer;
    }
    public static void main(String[] args){
        Pro65 pro65 = new Pro65();
        int[] num_list = {13, 22, 53, 24, 15, 6};
        System.out.println(pro65.solution(num_list));
    }
}
