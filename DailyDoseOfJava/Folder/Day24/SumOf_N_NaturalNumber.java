package Day24;

import java.util.Scanner;

public class SumOf_N_NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number: ");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(), sum = 0;
		for (int i = 1; i <= N ; i++)
		{
			sum += i;
		}
		System.out.println("Sum of N Natural number is: "+sum);
	}

}
