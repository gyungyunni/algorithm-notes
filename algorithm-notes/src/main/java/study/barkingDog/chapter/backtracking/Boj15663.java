package study.barkingDog.chapter.backtracking;


import java.util.*;

public class Boj15663 {
    static int n, m;
    static int[] arr;
    static int[] num;
    static boolean[] isused;

    public static void func(int k) {
        if (k == m) {
            for (int i = 0; i < m; ++i) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        int tmp = 0;
        for (int i = 0; i < n; ++i) {
            if (!isused[i] && tmp != num[i]) {
                isused[i] = true;
                arr[k] = num[i];
                tmp = arr[k];
                func(k + 1);
                isused[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[10];
        num = new int[10];
        isused = new boolean[10];

        for (int i = 0; i < n; ++i)
            num[i] = sc.nextInt();
        Arrays.sort(num, 0, n);
        func(0);
    }
}