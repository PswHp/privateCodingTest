package inputOutput_ArithmeticOperation;
import java.util.Scanner;

public class Test_1001 {	//Ŭ���� �̸��� Main����!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B=0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > 0 && B < 10)
			System.out.print(A-B);
	}
}