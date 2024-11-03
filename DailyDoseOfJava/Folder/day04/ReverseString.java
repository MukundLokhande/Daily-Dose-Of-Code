package day04;

public class ReverseString 
{
	public static String reverseString(String name)
	{
		String RS = "";
		for (int i = name.length()-1 ; i >= 0; i--)
		{
			 RS = RS + name.charAt(i);
		}
		return RS;
	}
	
	public static void main(String[] args)
	{
		String name = "Kunal";
		System.out.println(reverseString(name));
	}

}
