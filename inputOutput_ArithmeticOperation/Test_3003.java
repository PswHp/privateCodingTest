package inputOutput_ArithmeticOperation;

import java.util.Scanner;

public class Test_3003 {

	public static void main(String[] args) {
		//ŷ1 ��1 ��2 ���2 ����Ʈ2 ��8
		//ù° �ٿ� �����̰� ã�� ��� ŷ, ��, ��, ���, ����Ʈ, ���� ������ �־�����. �� ���� 0���� ũ�ų� ���� 10���� �۰ų� ���� �����̴�.
		Scanner sc = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		king = king - sc.nextInt();
		queen = queen - sc.nextInt();
		rook = rook - sc.nextInt();
		bishop = bishop - sc.nextInt();
		knight = knight - sc.nextInt();
		pawn = pawn - sc.nextInt();
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn + " ");
	}

}
