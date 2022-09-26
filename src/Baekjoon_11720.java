import java.util.*;

public class Baekjoon_11720 {
    public static void main(String[] args){

        Scanner put = new Scanner(System.in);
        int num = put.nextInt();
        int sum = 0;
        String str = put.next();

        for(int i=0; i<num; i++) {
            sum += str.charAt(i)-'0'; // '0' = 48
        }
        System.out.println(sum);

        // int 나 char 형을 +, - 으로 연산하게 되면 아스키코드로 변환되어 int형이 된다.
        // 문자 '0'의 아스키코드가 48 이므로, "(숫자형문자)-48" 혹은 "(숫자형문자)-'0'" 을 해주면
        // 본래의 숫자를 얻을 수 있다.
    }
}
