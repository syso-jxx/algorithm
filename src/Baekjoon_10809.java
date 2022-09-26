import java.util.Scanner;

public class Baekjoon_10809 {
    public static void main(String[] args) {

        Scanner put = new Scanner(System.in);
        String str = put.next();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String result = "";

        for(int i = 0 ; i < str.length() ; i++) {
            for(int j = 0 ; j < 26 ; j++) {
                if(str.substring(i, i+1).equals(abc.substring(j, j+1))) {
                    result = result+ " " + String.valueOf(i);
                }else {
                    result = result+ " " + "-1";
                }
            }
        }
        System.out.println(result);
    }
}
