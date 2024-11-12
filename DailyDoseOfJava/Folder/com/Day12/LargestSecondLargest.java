package com.Day12;

public class LargestSecondLargest 
{
	public static void main(String[] args)
	{
	int arr[] = {1,5,7,9,5,9,6,7,88,79,4,66};
	
	int max = Integer.MIN_VALUE;
	int max2 = Integer.MIN_VALUE;
	
	for(int i = 0; i < arr.length; i++)
	{
		if (arr[i] > max && arr[i] > max2)
		{
			max2 = max;
			max = arr[i];
		}
		else if(arr[i] > max2)
		{
			max2 = arr[i];
				
			
		}
	
	}
	System.out.println("Largest number: "+ max+"Second Largest number: "+ max2);
}
}
