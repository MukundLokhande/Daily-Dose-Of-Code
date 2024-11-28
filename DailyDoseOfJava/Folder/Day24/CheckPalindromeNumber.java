package Day24;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 54545;
		
		
		int backUp = number, d = 0, reverse = 0;
		while (number > 0)
		{
			d = number % 10;
			number = number / 10;
			reverse = (reverse * 10) + d;
		}
		if (backUp == reverse)
			System.out.println("Number is Palindrome");
		else {
			System.out.println("Number is not Palindrome");
		}
	}

}
