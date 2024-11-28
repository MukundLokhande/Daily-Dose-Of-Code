package Day24;

import java.util.Scanner;

public class PrintAllPrimefrom1ToN {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int Number = scanner.nextInt(), k = 0;
		int arr[] = new int[Number];
		// TODO Auto-generated method stub
		for (int i = 2; i <= Number; i++)
		{
			boolean flag = true;
			for(int j = 2 ; j <= i ; j++)
			{
				if(i % j == 0 && i != j )
				{
					 flag = false;
				}
			}
			if (flag == true)
			{
				arr[k] = i;
				k++;
			}
		}
		for(int x : arr)
		{
			System.out.print(x + "   ");
		}
	}

}
