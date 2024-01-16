package programmers.lv0_2;

// https://school.programmers.co.kr/learn/courses/30/lessons/181881
public class Pro80 {
    public int solution(int[] arr) {
        int answer = 0;
        while (true){
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                if(num >= 50 && num % 2 == 0){
                    num /= 2;
                    flag = true;
                } else if(num < 50 && num % 2 != 0){
                    num = num * 2 + 1;
                    flag = true;
                }
                arr[i] = num;
            }
            answer++;
            if(!flag){
                break;
            }
        }
        return answer - 1;
    }

    public static void main(String[] args) {
        Pro80 pro80 = new Pro80();
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(pro80.solution(arr));
    }
}
