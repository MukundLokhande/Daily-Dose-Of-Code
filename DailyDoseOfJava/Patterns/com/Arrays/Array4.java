package com.Arrays;

public class Array4 
{
	public static int linearStringSearch(String names[], String key)
	{
		for (int i = 0; i < names.length; i++)
		{
			if(names[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main (String[] args)
	{
		String names[]= {"Aman", "Priya", "chetan", "sujit"};
		String key = "Priya";
		
		int index = linearStringSearch(names, key);
		if (index == -1)
		{
			System.out.println("Not Found");
		}
		else {
			System.out.println("Key String at index: " + index);
		}
	}	

}
