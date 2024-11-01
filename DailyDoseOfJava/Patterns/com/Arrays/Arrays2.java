package com.Arrays;
import java.util.Scanner;

public class Arrays2 
{
	public static void update(int arr[]) {
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = arr[i] + 1;
		}
	}

	public static void main(String[] args)
	{
		int arr[] = {23,43,543,56,67};
		System.out.println("User Given Array: ");
		for(int i = 0 ; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		update(arr);
		System.out.println("");
		System.out.println("Updated Array");
		for(int i = 0 ; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
