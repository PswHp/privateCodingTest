package inputOutput_ArithmeticOperation;

import java.util.Scanner;

public class Test_2588 {

	public static void main(String[] args) {
		//472
		//385
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 * (num2%10));
		System.out.println(num1 * ( (num2%100) - (num2%10) )/10 );
		System.out.println(num1 * (num2/100));
		System.out.println(num1 * num2);
	}
}
