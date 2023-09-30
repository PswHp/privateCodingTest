import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int maxNum = 0;
        int maxNumIndex = 0;
        int index = 0;

        for (int i : arr) {
            index++;
            if (i > maxNum) {
                maxNum = i;
                maxNumIndex = index;
            }
        }

        System.out.println(maxNum + "\n" + maxNumIndex);

    }
}