package inputOutput_ArithmeticOperation;

import java.util.Scanner;

public class Test_10430 {

	public static void main(String[] args) {
		//ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println( (a+b)%c );
		System.out.println( ((a%c)+(b%c))%c );
		System.out.println( (a*b)%c );
		System.out.println( ((a%c) * (b%c))%c );

	}

}