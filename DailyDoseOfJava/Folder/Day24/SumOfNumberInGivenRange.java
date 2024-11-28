package Day24;

import java.util.Scanner;

public class SumOfNumberInGivenRange {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number as range, to find the sum of this range: ");
		int rangeFirst = scanner.nextInt(), rangeLast = scanner.nextInt(), sum = 0;
		for (int i = rangeFirst; i <= rangeLast; i++)
		{
			sum += i;
		}
		System.out.println("The Sum of given range is: " + sum);
	}
}
