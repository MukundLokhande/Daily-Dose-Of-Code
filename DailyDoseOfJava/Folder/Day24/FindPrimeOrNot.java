package Day24;

import java.util.Scanner;

public class FindPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int Number = scanner.nextInt();
		boolean flag = true;
		
		for(int i = 2 ; i < Number; i++)
		{
			if (Number % i == 0)
			{
				System.out.println("The Number is Not Prime");
				flag = false;
				break;
			}
		}
		if (flag == true)
			System.out.println("The Number is Prime");
	}

}
