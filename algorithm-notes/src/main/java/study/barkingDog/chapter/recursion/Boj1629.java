package study.barkingDog.chapter.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1629 {
    public static long pow(long a, long b, long m) {
        if (b == 1)   // base condition
            return a % m;  // a가 m보다 클 수 있기 때문에 a를 반환하는 대신 나머지 반환
        long val = pow(a, b / 2, m); // 만약 b가 7이었다고 하면 7/2 =3 이므로
        val = val * val % m;  // val = a^6 mod m 이 들어감
                              // 즉, b가 짝수이면 바로 val의 값을 반환하지만 홀수이면 val에 a를 한번 더 곱해서 반환
                              // pow(5,14,3)이 pow(5,7,3)을 부르고, pow(5,7,3)이 pow(5,3,3)을 부르고
        if (b % 2 == 0)
            return val;
        return val * a % m;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(pow(a,b,c));
    }

}