package conditional_Statement;
import java.util.Scanner;
public class Test_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int early_Min = 45;
		
		if (min - early_Min < 0) {
			if (hour != 0) {
				hour -= 1;
				min = 60 - Math.abs((min - early_Min));
				System.out.println(hour +" " + min);
			}
			else
			{
				hour = 23;
				min = 60 - Math.abs((min - early_Min));
				System.out.println(hour +" " + min);
			}
		}
		else {
			min = min - early_Min;
			System.out.println(hour + " " + min);
		}

	}
}