package com.Arrays;

// Linear Search

public class Arrays3 
{
	public static int LinearSearch(int numbers[], int key)
	{
			for(int i = 0; i < numbers.length ; i++)
			{
				if (numbers[i] == key)
				{
					return i;
				}
			}
			return -1;
	}

	public static void main(String[] args)
	{
		int numbers[] = {97,75,56,32,67,47,88,90};
		int key = 67;
		int index = LinearSearch(numbers, key);
		if(index == -1)
		{
			System.out.println("Not Found");

		}
		else {
			System.out.println("Key is at index: " + index);
		}
	}
}
