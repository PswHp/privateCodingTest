package conditional_Statement;
import java.util.Scanner;
public class Test_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roll1 = sc.nextInt();
		int roll2 = sc.nextInt();
		int roll3 = sc.nextInt();
		int reward = 0;
		
		if (roll1 == roll2 && roll2 == roll3) {	//°°Àº ´« 3°³
			reward = 10000 + roll1 * 1000;
		}
		else if (roll1 == roll2 && roll1 != roll3) {
			reward = 1000 + roll1*100;
		}
		else if (roll1 == roll3 && roll2 != roll3) {
			reward = 1000 + roll1*100;
		}
		else if (roll2 == roll3 && roll1 != roll2) {
			reward = 1000 + roll2*100;
		}
		else
		{
			int max = roll1;
			
			if (max < roll2)
				max = roll2;
			
			if (max < roll3)
				max = roll3;
			
			reward = max * 100;
		}
		
		System.out.println(reward);
		
	}

}
