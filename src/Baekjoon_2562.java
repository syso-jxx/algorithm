import java.util.Scanner;

public class Baekjoon_2562 {
    public static void main(String[] args) {

        int[] arr = new int[9];
        int max = arr[0];
        int num = 0;
        Scanner put = new Scanner(System.in);
        for(int i = 0 ; i < 9 ; i++) {
            arr[i] = put.nextInt();
            if(max < arr[i]) {
                max = arr[i];
                num = i+1;
            }
        }
        System.out.println(max + "\n" + num);
    }
}
