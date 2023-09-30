import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 공 넣는 횟수
        int[] arr = new int[N];

        for (int count = 0; count < M; count++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken()); // 첫 바구니
            int j = Integer.parseInt(st.nextToken()); // 마지막 바구니
            int k = Integer.parseInt(st.nextToken()); // 공 번호

            for (int count2 = i - 1; count2 < j; count2++) {
                arr[count2] = k;
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}