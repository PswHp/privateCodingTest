package conditional_Statement;
import java.util.Scanner;
public class Test_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int timer = sc.nextInt();
		
		if (min + timer >= 60)
		{
			hour += (min+timer)/60;
			min = (min+timer) - ((min+timer)/60)*60;
			if (hour >=24)
				hour -= 24;
			System.out.print(hour + " " + min);
		}
		else
		{
				min = min + timer;
				System.out.print(hour + " " + min);
			
		}
		

	}

}
