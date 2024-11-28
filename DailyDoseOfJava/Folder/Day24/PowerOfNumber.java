package Day24;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number, Power;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		Number = scanner.nextInt();
		System.out.println(" Its Power");
		Power = scanner.nextInt();
		
		if(Power == 0)
		{
			System.out.println(0);
		}
		int Multiply = 1;
		for (int i = 1; i <= Power; i++)
		{
			Multiply = Multiply * Number;
		}
		System.out.println("Multiply: " + Multiply);
	}
}
