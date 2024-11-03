package day04;

import java.util.Scanner;

public class CountEvenOddInArray 
{
	public static void countEvenOdd(int arr[])
	{
		int countE = 0,countO = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				countE++;
			}else {
				countO++;
			}
		}
		
		System.out.println("Count of Even numbers: "+ countE+ " Count Of Odd Numbers: " + countO);
	}
	
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		System.out.println("Enter an 10 Digit array of integers: ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		countEvenOdd(arr);
		
	}

}
