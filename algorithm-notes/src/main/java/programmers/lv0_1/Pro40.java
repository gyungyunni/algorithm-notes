package programmers.lv0_1;

// https://school.programmers.co.kr/learn/courses/30/lessons/181921
// 배열 만들기 2
public class Pro40 {
    public static boolean isZeroOr5(int num) {
        while (num > 0) {
            int digitOf1 = num % 10;
            if (digitOf1 != 0 && digitOf1 != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static int[] solution(int l, int r) {
        int[] arr = new int[r - l];
        int cnt = 0;
        for (int i = l; i <= r; i++) {
            if (isZeroOr5(i)) {
                arr[cnt++] = i;
            }
        }
        if (cnt > 0) {
            int[] answer = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                answer[i] = arr[i];
            }
            return answer;
        } else {
            return new int[]{-1};
        }
    }
}

//class Solution {
//    public int[] solution(int l, int r) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i < 64; i++) {
//            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
//            if (l <= num && num <= r)
//                list.add(num);
//        }
//
//        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
//        // ArrayList<Integer>로 만들었기 때문에 int로 변환하는 작업 필요
//    }
//}
