package inputOutput_ArithmeticOperation;
import java.util.Scanner;

public class Test_1008 {	//클래스 이름은 Main으로!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = 0, B=0;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		if (A > 0 && B < 10)
			System.out.print(String.format("%.9f", A/B));
	}
}