package inputOutput_ArithmeticOperation;
import java.util.Scanner;

public class Test_1008 {	//Ŭ���� �̸��� Main����!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = 0, B=0;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		if (A > 0 && B < 10)
			System.out.print(String.format("%.9f", A/B));
	}
}