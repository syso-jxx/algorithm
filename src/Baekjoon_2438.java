import java.util.Scanner;

public class Baekjoon_2438 {
    public static void main(String[] args) {

        Scanner lineNum = new Scanner(System.in);
        int n = lineNum.nextInt();
        String star = "*";

        for(int i = 0; i < n ; i++) {

            System.out.println(star);
            star = star + "*";
        }
    }
}
