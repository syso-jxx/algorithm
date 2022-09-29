import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_15552 {
    public static void main(String[] args) throws IOException {
/*
//      BufferedWriter를 이용한 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(A + B + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
*/

/*

//      StringBuilder를 이용한 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); // A 저장
            int B = Integer.parseInt(st.nextToken()); // B 저장
            sb.append(A + B).append('\n');
        }
        br.close();
        System.out.println(sb);
*/


//      substring()를 이용한 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int blank = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0, blank)) + Integer.parseInt(str.substring(blank + 1));
            sb.append(result+"\n");
        }
        br.close();
        System.out.print(sb);
    }
}
