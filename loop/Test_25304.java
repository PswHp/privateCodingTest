package loop;
import java.util.Scanner;
public class Test_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt(); //총 금액
		int num = sc.nextInt(); //물건의 종류 수
		int price[] = new int[num];
		int sum = 0;
		for (int i = 0; i < num; i++)
		{
			price[i] = sc.nextInt(); //가격
			int count = sc.nextInt(); //개수
			price[i] = price[i] * count;
			sum += price[i];
		}
		if (sum == total)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}