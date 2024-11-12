package com.Day12;

public class CharCount {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = "ppeeuuuuuaaabnnee";
		//
		int counta =0, counti = 0, counte=0, counto= 0, countu=0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a')
			{
				counta++;
			}
			else if (str.charAt(i) == 'i')
			{
				counti++;
			}
			else if (str.charAt(i) == 'e')
			{
				counte++;
			}
			else if (str.charAt(i) == 'o')
			{
				counto++;
			}
			else if (str.charAt(i) == 'u')
			{
				countu++;
			}
		}
		System.out.println("Count of Vowels Present in given string are: ");
		System.out.println("A:" + counta+ " I:" + counti+" E:" + counte+" O:" + counto+" U:" + countu);
	}

}
