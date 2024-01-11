package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181931
// 등차수열의 특정한 항만 더하기
public class Pro30 {
    public int solution(int a, int d, Boolean[] included) {
        int answer = 0;
        for(Boolean is : included){
            if(is)
                answer += a;
            a = a + d;
        }
        return answer;
    }
    /*
        public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
    }
     */
    public static void main(String[] args){
        Pro30 pro30 = new Pro30();
        Boolean[] included = {true, false, false, true, true};
        System.out.println(pro30.solution(3,4, included));
    }
}
