package Day24;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x > 0 )
		{
			System.out.print("Your Number is Positive ");
		}
		else {
			System.out.print("Your Number is Negative ");
		}
		if (x % 2 == 0)
		{
			System.out.println("Even number");
		}
		else {
			System.out.println("Your Number is Odd number");
		}
	}

}
