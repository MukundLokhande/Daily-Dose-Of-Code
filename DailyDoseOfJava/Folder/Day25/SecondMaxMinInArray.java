package Day25;

import java.util.Scanner;

public class SecondMaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 Numbers: ");
		for(int i = 0; i < 10; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		if (arr.length < 2)
		{
			System.out.println("Array length should be greater than 1");
		}
            
        int max = Integer.MIN_VALUE, Smax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >  max && arr[i] > Smax)
            {
                Smax = max;
                max = arr[i];
            }
            else if (arr[i] > Smax && arr[i] < max)
            {
                Smax = arr[i];
            }
        }
        int min = Integer.MAX_VALUE, Smin = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <  min && arr[i] < Smin)
            {
                Smin = min;
                min = arr[i];
            }
            else if (arr[i] < Smin && arr[i] < min)
            {
                Smin = arr[i];
            }
        }
        
        System.out.println("Second Largest Element is: "+Smax +
        		" Second Smallest Element is: "+Smin);
        
	}

}
