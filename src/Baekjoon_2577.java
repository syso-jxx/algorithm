import java.util.Scanner;

public class Baekjoon_2577 {
    public static void main(String[] args) {

        int[] arr = new int[3];
        int num = 1;
        int cnt = 0;
        Scanner put = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++) {
            arr[i] = put.nextInt();
            num = num * arr[i];
        }
        String str = String.valueOf(num);
        for(int j = 0 ; j < 10 ; j++) {
            for(int i = 0 ; i < str.length() ; i++) {
                if(str.substring(i,i+1).equals(String.valueOf(j))) {
                    cnt = cnt + 1;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}
