package inputOutput_ArithmeticOperation;
import java.util.Scanner;

public class Test_10998 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > 0 && B < 10)
			System.out.print(A*B);
		
	}
}