import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1978 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();	// 수의 개수 N
        StringTokenizer st = new StringTokenizer(br.readLine()); // 소수인지 판별할 N개의 수 나열
        int cnt = 0; // 소수의 개수

        while(st.hasMoreTokens()) { // StringTokenizer 클래스의 hasMoreTokens() 메소드(토큰이 남아있는지 여부를 true, false 로 반환)

            boolean isPrime = true; // 소수는 true, 아닌 경우 false
            int num = Integer.parseInt(st.nextToken()); // 소수인지 판별할 수

            if(num == 1) { // 1은 소수가 아니다
                continue; // while문 조건문으로 돌아가기
            }
            // 제곱근이 2 미만인 2, 3은 소수. 아래 for문은 num이 4 이상일 때.
            for(int i = 2; i <= Math.sqrt(num); i++) { // java.lang.Math 클래스의 sqrt() 메소드(제곱근 구하기)
                if(num % i == 0) { // 소수가 아닌 경우 false
                    isPrime = false;
                    break; // for문 break
                }
            }
            if(isPrime) { // num이 소수이면
                cnt++; // cnt 증가
            }
        }
        System.out.println(cnt);
    }
}
