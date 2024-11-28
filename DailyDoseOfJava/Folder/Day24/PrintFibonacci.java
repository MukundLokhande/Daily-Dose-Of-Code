package Day24;

import java.util.Scanner;

public class PrintFibonacci
{
	public static void main (String args[])
	{
		int N, F = 0, S = 1,NewNo = 0;
		Scanner objScanner = new Scanner(System.in);
		System.out.println("Enter Value Of N: ");
		N = objScanner.nextInt();
		int arr[] = new int[N];
		arr[1] = 1;
		for (int i = 2; i < N ; i++)
		{
			NewNo = F + S;
			F = S;
			S = NewNo;
			arr[i] = NewNo;
		}
		System.out.println("Below is the fibonacci Sequence till your desired count: ");
		for (int x : arr)
		{
			System.out.print(x+ "  ");
		}
	}
}