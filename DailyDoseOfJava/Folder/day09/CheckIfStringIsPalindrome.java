package day09;

public class CheckIfStringIsPalindrome {

	public static Boolean checkPalindrome(String str)
	{
		boolean check=false;
		String revString="";
		for(int i = str.length()-1; i >= 0; i--)
		{
			revString = revString + str.charAt(i);
		}
		if(str.equals(revString))
		{
			check = true;
			return check;
		}
		return check;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "MalayalaM";
		System.out.println(checkPalindrome(str));
	}
}
