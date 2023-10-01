import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] check = new int[31];

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            check[n] = 1;
        }

        for (int i = 1; i <= 30; i++) {
            if (check[i] != 1) {
                System.out.println(i);
            }
        }

    }
}