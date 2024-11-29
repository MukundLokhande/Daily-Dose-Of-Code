package Day25;

import java.util.Scanner;

public class FirstMinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 Numbers: ");
		for(int i = 0; i < 10; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("MAX: "+max+" MIN: "+min);
	}

}
