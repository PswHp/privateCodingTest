import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 'z' - 'a' + 1;
        int[] arr = new int[num];

        String S = br.readLine();

        for (int i = 0; i < num; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);

            if (arr[s - 'a'] == -1) {
                arr[s - 'a'] = i;
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}