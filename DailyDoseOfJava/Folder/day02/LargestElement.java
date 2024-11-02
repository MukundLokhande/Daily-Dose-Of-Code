package day02;

import java.util.Scanner;

public class LargestElement {
	
	public static int getlargest(int arr[])
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++ )
		{
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();
			
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		 
		return max;
	}
	public static void main (String[] args)
	{
		int arr[] = new int[10];
		System.out.println("Largest Number: " +getlargest(arr));
	}
}
