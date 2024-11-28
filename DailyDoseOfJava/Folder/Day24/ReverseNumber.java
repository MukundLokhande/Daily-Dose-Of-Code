package Day24;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 74889;
		
		
		int backUp = number, d = 0, reverse = 0;
		while (number > 0)
		{
			d = number % 10;
			number = number / 10;
			reverse = (reverse * 10) + d;
		}
		System.out.println("Reverse of given number: "+ backUp +
				" is: "+ reverse);
		
		
	}

}
