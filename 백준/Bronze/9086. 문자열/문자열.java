import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String arr[] = new String[T];

        for (int i = 0; i < T; i++) {
            String S = br.readLine();
            arr[i] = S.substring(0, 1) + S.substring(S.length() - 1);
        }

        for (String i : arr) {
            System.out.println(i);
        }

    }
}