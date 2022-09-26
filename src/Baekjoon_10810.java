import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_10810 {
    public static void main(String[] args) {

        Scanner put = new Scanner(System.in);
        int count = put.nextInt();
        int[] arr = new int[count];
        for(int i = 0 ; i < count ; i++) {
            arr[i] = put.nextInt();
        }
        Arrays.sort(arr);

        System.out.print(arr[0] + " " + arr[count-1]);

    }
}
