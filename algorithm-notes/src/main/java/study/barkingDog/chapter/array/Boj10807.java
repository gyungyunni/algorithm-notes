package study.barkingDog.chapter.array;


import java.util.Scanner;

public class Boj10807 {
    public int solution(int N, int[] arr, int X) {
        int answer = 0;
        for (int e : arr){
            if(e == X){
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Boj10807 boj10807 = new Boj10807();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        System.out.println(boj10807.solution(N, arr, X));
    }
}
