import java.util.Scanner;

public class Baekjoon_2439 {
    public static void main(String[] args) {

        Scanner lineNum = new Scanner(System.in);
        int n = lineNum.nextInt();
        int m = n;
        String star = "*";
        String blank = " ";

        for(int i = 0; i < n ; i++) {

            for(int j = n-i-1 ; j > 0 ; j--) {
                System.out.print(blank);
            }
            System.out.println(star);
            star = star + "*";
        }
    }
}
