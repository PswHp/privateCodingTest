import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 바구니 개수
        int M = Integer.parseInt(st.nextToken()); // 공 바꾸는 횟수

        int[] arr = new int[N];
        int change = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int count = 0; count < M; count++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            change = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = change;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}