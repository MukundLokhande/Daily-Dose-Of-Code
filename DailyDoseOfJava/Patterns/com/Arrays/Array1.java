package com.Arrays;
import java.util.Scanner;

public class Array1 
{
	public static void main(String[] args)
	{
		int marks[] = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		marks[0] = sc.nextInt();//phy
		marks[1] = sc.nextInt();//chem
		marks[2] = sc.nextInt();//maths
		
		marks[1] = marks[1] + 2;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		//marks[2] = 100;
		System.out.println(marks[2]);
		
		System.out.println(marks.length);
		
	}
}
