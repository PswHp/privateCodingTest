import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr.add(sc.nextInt());
        }
        int findNum = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if (findNum == arr.get(i)) {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}