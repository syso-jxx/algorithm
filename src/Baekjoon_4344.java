import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;
        int over = 0;

        for (int i = 0; i < C; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            for (int j = 0; j < N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double avg = (double) sum / N;
            for (int k = 0; k < N; k++){
                if(arr[k] > avg){
                    over++;
                }
            }
            String ratio = String.format("%.3f", (double) over / N * 100);
            System.out.println(ratio + "%");

            sum = 0;
            over = 0;
        }
    }
}