package study.barkingDog.studyTime.secondWeek;

//https://school.programmers.co.kr/learn/courses/30/lessons/64061

import java.util.Stack;

public class Pro1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int move : moves) { // [1,5,3,5,1,2,1,4]
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;
                    break; // 0이 아닌것을 발견했기 때문에 뽑아서, 다음 move로 넘어감
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pro1 pro1 = new Pro1();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(pro1.solution(board, moves));
    }
}
