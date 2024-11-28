package Day24;

import java.util.Scanner;

public class CheckArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number: ");
		Scanner scanner = new Scanner(System.in);
		int Number = scanner.nextInt(), count= 1, 
				d = 0, sum = 0;
		int backUp = Number;
		
		while (Number > 0)
		{
			Number = Number / 10;
			if(Number > 0)
				count++;
		}
		
		Number = backUp;
		while (Number > 0)
		{
			d = Number % 10;
			int multiple = 1;
			for (int i = 1; i <= count; i++)
			{
				multiple = multiple * d;
			}
			sum = sum + multiple;
			Number = Number / 10;
		}
		if (backUp == sum)
			System.out.println("Armstrong");
		else 
			System.out.println("Not Armstrong");
	}
}
