import java.util.Scanner;

public class Baekjoon_10809 {
    public static void main(String[] args) {
/*
        indexOf를 이용한 방법

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                        "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < arr.length; i++){
            int location = S.indexOf(arr[i]);
            System.out.println(location);
        }
*/

        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        for (char c = 'a'; c <= 'z'; c++){
            System.out.println(S.indexOf(c));
        }
    }
}
