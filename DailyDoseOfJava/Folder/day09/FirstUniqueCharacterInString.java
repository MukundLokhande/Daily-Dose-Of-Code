package day09;

public class FirstUniqueCharacterInString {

	public static char check(String string)
	{
		
		for (int i = 0 ; i < string.length(); i++)
		{	boolean flag = false;
		
			for(int j = 0; j < string.length(); j++)
			{
				if (i != j && string.charAt(i) == string.charAt(j))
				{ 
					flag = true;
					break;
				}
			}
			if(flag == false)
				return string.charAt(i);
		
		}
		return 0;
	}
	public static void main(String[] args)
	{
		String string = "swiss";
		System.out.println(check(string));
		
	}
}
